package ifrn.pi.ocorrencias.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocorrencia")
public class Ocorrencia {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "datas", nullable = false, unique = false, length = 10)
	private String data;

	@Column(name = "horario", nullable = false)
	private String horario;

	@Column(name = "principal_sintoma", nullable = false, unique = false)
	private String principal_sintoma;

	@Column(name = "principal_motivo", nullable = false, unique = false)
	private String principal_motivo;

	// Criar uma referencia para aluno.

	public Ocorrencia() {

	}

	public Ocorrencia(String data, String horario, String principal_sintoma, String principal_motivo

	) {

		this.data = data;
		this.horario = horario;
		this.principal_sintoma = principal_sintoma;
		this.principal_motivo = principal_motivo;
		// this.alunos = alunos;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
