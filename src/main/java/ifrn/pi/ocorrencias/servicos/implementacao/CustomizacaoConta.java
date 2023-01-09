package ifrn.pi.ocorrencias.servicos.implementacao;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ifrn.pi.ocorrencias.entidades.Conta;
import ifrn.pi.ocorrencias.entidades.Funcao;
import ifrn.pi.ocorrencias.repositorios.ContaRepositorio;

@Service
public class CustomizacaoConta implements UserDetailsService {
	
	@Autowired
	private ContaRepositorio contaRepositorio;

	public CustomizacaoConta(ContaRepositorio contaRepositorio) {
		this.contaRepositorio = contaRepositorio;
	}

	@Override
	public UserDetails loadUserByUsername(String matricula) throws UsernameNotFoundException {
		Conta conta = this.contaRepositorio.findByMatricula(matricula);
		if(conta != null) {
			return new User(conta.getMatricula(),
					conta.getSenha(),
					mapearAutorizacao(conta.getFuncoes()));
		} else {
			throw new UsernameNotFoundException("A matricula ou senha são inválidos");
		}
	}

	private Collection<? extends GrantedAuthority> mapearAutorizacao(Collection<Funcao> funcoes) {
		Collection<? extends GrantedAuthority> mapRoles = funcoes.stream()
				.map(funcao -> new SimpleGrantedAuthority(funcao.getNome())).collect(Collectors.toList());
		return mapRoles;
	}

}


