package ifrn.pi.ocorrencias.dto;

public class AlunoDto {
	
	// Esta classe serve para troca de informações entre as partes do sistema
		// sem comprometer o encapsulamento das entidades.
		// O DTO significa Data Transfer Object (Objeto de Transferência de Dados)

		private Long id;
		private String nome;
		private String email;
		private String telefone;

		public AlunoDto() {

		}

		public AlunoDto(Long id, String nome, String email, String telefone, String senha) {
			this.id = id;
			this.nome = nome;
			this.email = email;
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

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
}
