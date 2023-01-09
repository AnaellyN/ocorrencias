package ifrn.pi.ocorrencias.dto;

import java.sql.Date;

public class AlunoDto {
	
	// Esta classe serve para troca de informações entre as partes do sistema
		// sem comprometer o encapsulamento das entidades.
		// O DTO significa Data Transfer Object (Objeto de Transferência de Dados)

		private Long id;
		private String nome;
		private String email;
		private String cpf;
		private String password;
		private Date dataDeNascimento; //adicionado agora
		private String telefone; //adicionado agora



		public AlunoDto(Long id, String nome, String email, String cpf, String password, Date dataDeNascimento, String telefone) {
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.cpf = cpf;
			this.password = password;
			this.dataDeNascimento = dataDeNascimento;
			this.telefone = telefone; 
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		

}
