package ifrn.pi.ocorrencias.dto;

public class ContaDto {
	
	private String email;

	private String matricula;

	private String senha;

	public ContaDto() {
		
	}

	public ContaDto(String email, String matricula, String senha) {
		this.email = email;
		this.matricula = matricula;
		this.senha = senha;
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
	
	
}
