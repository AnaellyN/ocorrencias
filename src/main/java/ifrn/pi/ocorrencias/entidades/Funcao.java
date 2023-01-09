package ifrn.pi.ocorrencias.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "funcoes")
public class Funcao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@ManyToMany(mappedBy = "funcoes")
	private List<Conta> contas = new ArrayList<>();

	public Funcao() {
		
	}

	public Funcao(long id, String nome, List<Conta> contas) {
		super();
		this.id = id;
		this.nome = nome;
		this.contas = contas;
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

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return this.nome;
	}

}
