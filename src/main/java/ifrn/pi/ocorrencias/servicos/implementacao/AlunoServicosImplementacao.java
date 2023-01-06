package ifrn.pi.ocorrencias.servicos.implementacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ifrn.pi.ocorrencias.dto.AlunoDto;
import ifrn.pi.ocorrencias.entidades.Aluno;
import ifrn.pi.ocorrencias.entidades.Funcao;
import ifrn.pi.ocorrencias.repositorios.AlunoRepositorio;
import ifrn.pi.ocorrencias.repositorios.FuncaoRepositorio;
import ifrn.pi.ocorrencias.servicos.AlunoServicos;

@Service
public class AlunoServicosImplementacao implements AlunoServicos {
		private AlunoRepositorio alunoRepositorio;
		private FuncaoRepositorio funcaoRepositorio;

		@Autowired
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}

		public AlunoServicosImplementacao(AlunoRepositorio alunoRepositorio, FuncaoRepositorio funcaoRepositorio) {
			this.alunoRepositorio = alunoRepositorio;
			this.funcaoRepositorio = funcaoRepositorio;
		}

		@Override
		public void cadastrarAluno(AlunoDto alunodto) {
			Aluno aluno = new Aluno();
			aluno.setId(alunodto.getId());
			aluno.setNome(alunodto.getNome());
			aluno.setTelefone(alunodto.getTelefone());

		//@Override
		//public Aluno findByMatricula(String matricula) {
			//return this.alunoRepositorio.findByMatricula(matricula);
		//}
	}
}
