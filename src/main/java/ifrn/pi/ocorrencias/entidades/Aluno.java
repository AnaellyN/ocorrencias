package ifrn.pi.ocorrencias.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos cadastrados")
public class Aluno {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "dataDeNascimento", nullable = false, unique = false, length = 10)
	private String dataDeNascimento;

	@Column(name = "telefone", nullable = false, unique = true, length = 11)
	private String telefone;

	@Column(name = "curso", nullable = false)
	private String curso;

	public Aluno() {

	}

	public Aluno(String nome, String dataDeNascimento, String telefone, String curso, Long id) {

	
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.telefone = telefone;
		this.curso = curso;
		this.id = id;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}