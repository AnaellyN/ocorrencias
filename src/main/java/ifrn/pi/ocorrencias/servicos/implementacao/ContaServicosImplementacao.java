package ifrn.pi.ocorrencias.servicos.implementacao;

import java.util.Arrays;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ifrn.pi.ocorrencias.dto.ContaDto;
import ifrn.pi.ocorrencias.entidades.Conta;
import ifrn.pi.ocorrencias.entidades.Funcao;
import ifrn.pi.ocorrencias.repositorios.ContaRepositorio;
import ifrn.pi.ocorrencias.repositorios.FuncaoRepositorio;
import ifrn.pi.ocorrencias.servicos.ContaServicos;

@Service
public class ContaServicosImplementacao implements ContaServicos {
	private ContaRepositorio contaRepositorio;
	private FuncaoRepositorio funcaoRepositorio;
	private PasswordEncoder encoder;
	
	
	public ContaServicosImplementacao(ContaRepositorio contaRepositorio, FuncaoRepositorio funcaoRepositorio,
			PasswordEncoder encoder) {
		this.contaRepositorio = contaRepositorio;
		this.funcaoRepositorio = funcaoRepositorio;
		this.encoder = encoder;
	}

	@Override
	public void cadastrarConta(ContaDto contadto) {
		Conta conta = new Conta();
		conta.setEmail(contadto.getEmail());
		conta.setMatricula(contadto.getMatricula());
		conta.setSenha(this.encoder.encode(contadto.getSenha()));
		Funcao funcao = this.funcaoRepositorio.buscarPorNome("ROLE_ADMIN");
		if(funcao == null) {
			funcao = checarFuncao();
		}
		conta.setFuncoes(Arrays.asList(funcao));
		this.contaRepositorio.save(conta);
	}

	@Override
	public Conta buscarPorMatricula(String matricula) {
		return this.contaRepositorio.buscarPorMatricula(matricula);
	}
	private Funcao checarFuncao() {
		Funcao funcao = new Funcao();
		funcao.setName("ROLE_ADMIN");
		return this.funcaoRepositorio.save(funcao);
		
	}

}
