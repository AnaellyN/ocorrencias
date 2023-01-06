package ifrn.pi.ocorrencias.servicos.implementacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ifrn.pi.ocorrencias.dto.OcorrenciaDto;
import ifrn.pi.ocorrencias.entidades.Aluno;
import ifrn.pi.ocorrencias.entidades.Ocorrencia;
import ifrn.pi.ocorrencias.repositorios.FuncaoRepositorio;
import ifrn.pi.ocorrencias.repositorios.OcorrenciaRepositorio;
import ifrn.pi.ocorrencias.servicos.OcorrenciaServicos;

@Service
public class OcorrenciaServicosImplementacao implements OcorrenciaServicos {
	private OcorrenciaRepositorio ocorrenciaRepositorio; 
	private FuncaoRepositorio funcaoRepositorio;
	private OcorrenciaDto ocorrenciaDto;
	private Ocorrencia ocorrencia;
	
	//@Autowired
	//private PasswordEncoder passwordEncoder;
		
		@Autowired
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
  }
		public OcorrenciaServicosImplementacao(OcorrenciaRepositorio ocorrenciaRepositorio, FuncaoRepositorio funcaoRepositorio) {
			this.ocorrenciaRepositorio = ocorrenciaRepositorio;
			this.funcaoRepositorio = funcaoRepositorio;
			//this.passwordEncoder = encoder;
		}
		
		@Override
		public void CadastrarOcorrencia(OcorrenciaDto ocorrenciaDto) {
			Ocorrencia ocorrencia = new Ocorrencia();
			ocorrencia.setData(ocorrenciaDto.getData());
			ocorrencia.setHorario(ocorrenciaDto.getHorario());
			ocorrencia.setPrincipal_motivo(ocorrenciaDto.getPrincipal_motivo());
			ocorrencia.setPrincipal_sintoma(ocorrenciaDto.getPrincipal_sintoma());
			Aluno aluno= new Aluno();
			//ocorrencia.setAluno);
			if(ocorrencia == null) {
			//	ocorrencia = checarOcorrencia();
			}
		}
		@Override
		public void CadastrarOcorrenia(OcorrenciaDto OcorrenciaDto) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public Ocorrencia buscarPorMatricula(String matricula) {
			// TODO Auto-generated method stub
			return null;
		}
		


}
