package ifrn.pi.ocorrencias.entidades;

import java.util.Date;

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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_curso", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private Curso curso;

	public Aluno() {

	}
	
	public Aluno(String nome, Date dataDeNascimento, String telefone, Curso curso) {

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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
	