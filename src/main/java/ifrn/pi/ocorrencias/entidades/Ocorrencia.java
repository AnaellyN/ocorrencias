package ifrn.pi.ocorrencias.entidades;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

		@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinTable(name = "funcoes_contas", joinColumns = { @JoinColumn(name = "contas_id", referencedColumnName = "id") }, 
				inverseJoinColumns = { @JoinColumn(name = "funcoes_id", referencedColumnName = "id") })

		private List<Aluno> alunos = new ArrayList<>();

		public Ocorrencia() {

		}

		public Ocorrencia(String data, String horario, String principal_sintoma, String principal_motivo, List<Aluno> alunos) {

			this.data = data;
			this.horario = horario;
			this.principal_sintoma = principal_sintoma;
			this.principal_motivo = principal_motivo;
			this.alunos = alunos;
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

		public List<Aluno> getAlunos() {
			return alunos;
		}

		public void setAlunos(List<Aluno> alunos) {
			this.alunos = alunos;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}
