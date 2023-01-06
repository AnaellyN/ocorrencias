    package ifrn.pi.ocorrencias.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ocorrencia")
public class Ocorrencia {
	
		private static final long serialVersionUID = 1L;


		@Column(name = "datas", nullable = false, unique = false, length = 10)
		private String data;

		@Column(name = "horario", nullable = false)
		private String horario; 
		
		@Column(name = "principal_sintoma", nullable = false, unique = false)
		private String principal_sintoma ;

		@Column(name = "principal_motivo", nullable = false, unique = false)
		private String principal_motivo;

  	 

		@ManyToOne
	    @JoinColumn(name="aluno_id", nullable=false)
	    private Aluno aluno;

		public Ocorrencia() {

		}

	public Ocorrencia(String data, String horario, String principal_sintoma, String principal_motivo, Aluno aluno) {

			this.data = data;
			this.horario = horario;
			this.principal_sintoma = principal_sintoma;
			this.principal_motivo = principal_motivo;
			this.aluno = aluno;
		}

		public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
