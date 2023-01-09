package ifrn.pi.ocorrencias.servicos.implementacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	
	//@Autowired
	//private PasswordEncoder passwordEncoder;
	
	@Autowired
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public ContaServicosImplementacao(ContaRepositorio contaRepositorio, FuncaoRepositorio funcaoRepositorio) {
		this.contaRepositorio = contaRepositorio;
		this.funcaoRepositorio = funcaoRepositorio;
		//this.passwordEncoder = encoder;
	}

	@Override
	public void cadastrarConta(ContaDto contadto) {
		Conta conta = new Conta();
		conta.setEmail(contadto.getEmail());
		conta.setMatricula(contadto.getMatricula());
		conta.setSenha(this.passwordEncoder().encode(contadto.getSenha()));
		Funcao funcao = this.funcaoRepositorio.findByNome("ROLE_" + contadto.getAutorizacaoReg().toUpperCase());
		if (funcao == null) {
			funcao = checarFuncao("ROLE_" + contadto.getAutorizacaoReg().toUpperCase());
		}
		conta.setFuncoes(Arrays.asList(funcao));
		this.contaRepositorio.save(conta);
	}

	@Override
	public Conta buscarPorMatricula(String matricula) {
		return this.contaRepositorio.findByMatricula(matricula);
	}

	private Funcao checarFuncao(String novaFuncao) {
		Funcao funcao = new Funcao();
		funcao.setNome(novaFuncao);
		return this.funcaoRepositorio.save(funcao);

	}

}
