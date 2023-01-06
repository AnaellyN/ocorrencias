package ifrn.pi.ocorrencias.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "alunos")
public class Aluno {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "dataDeNascimento", nullable = false)
	private Date dataDeNascimento;

	@Column(name = "telefone", nullable = false, unique = true, length = 11)
	private String telefone;

	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_curso", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private Curso curso;

	public Aluno() {

	}
	
	public Aluno(String nome, Date dataDeNascimento, String telefone, Curso curso, String email) {

		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Object getMatricula() {
		return null; 
		//pediu pra criar isso
	}

	public void setFuncoes(List<Funcao> asList) {
	//pediu pra criar isso
		
	}
}
	