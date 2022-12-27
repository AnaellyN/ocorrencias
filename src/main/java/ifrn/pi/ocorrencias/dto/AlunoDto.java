package ifrn.pi.ocorrencias.dto;

public class AlunoDto {
	
	// Esta classe serve para troca de informações entre as partes do sistema
		// sem comprometer o encapsulamento das entidades.
		// O DTO significa Data Transfer Object (Objeto de Transferência de Dados)

		private Long id;
		private String name;
		private String email;
		private String matricula;
		private String password;

		public AlunoDto() {

		}

		public AlunoDto(Long id, String name, String email, String matricula, String password) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.matricula = matricula;
			this.password = password;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
