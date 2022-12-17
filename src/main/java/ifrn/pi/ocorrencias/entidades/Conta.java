package ifrn.pi.ocorrencias.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "contas")
public class Conta {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "endereco_email", nullable = false)
	private String email;

	@Column(nullable = false, unique = true, length = 14)
	private String matricula;

	@Column(nullable = false)
	private String senha;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "funcoes_contas", joinColumns = { @JoinColumn(name = "contas_id", referencedColumnName = "id") }, // corrigir
																															// nomes
			inverseJoinColumns = { @JoinColumn(name = "funcoes_id", referencedColumnName = "id") })

	private List<Funcao> funcoes = new ArrayList<>();

	public Conta() {

	}

	public Conta(long id, String email, String matricula, String senha, List<Funcao> funcoes) {

		this.id = id;
		this.email = email;
		this.matricula = matricula;
		this.senha = senha;
		this.funcoes = funcoes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Funcao> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(List<Funcao> funcoes) {
		this.funcoes = funcoes;
	}

}
