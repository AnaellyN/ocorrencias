package ifrn.pi.ocorrencias.dto;

public class OcorrenciaDto {
	
	private String data;
	private String horario;
	private String principal_sintoma;
	private String principal_motivo;
		

	public  OcorrenciaDto(String data, String horario,String principal_sintoma,String principal_motivo) {
		this.data = data;
		this.horario = horario;
		this.principal_sintoma = principal_sintoma;
		this.principal_motivo = principal_motivo;
		
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getPrincipal_sintoma() {
		return principal_sintoma;
	}
	public void setPrincipal_sintoma(String principal_sintoma) {
		this.principal_sintoma = principal_sintoma;
	}
	public String getPrincipal_motivo() {
		return principal_motivo;
	}
	public void setPrincipal_motivo(String principal_motivo) {
		this.principal_motivo = principal_motivo;
	}

}
