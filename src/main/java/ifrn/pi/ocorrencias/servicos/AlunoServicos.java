package ifrn.pi.ocorrencias.servicos;

import ifrn.pi.ocorrencias.dto.AlunoDto;
import ifrn.pi.ocorrencias.entidades.Aluno;

public interface AlunoServicos {

	void cadastrarAluno(AlunoDto alunodto);
	
	//Aluno findByMatricula(String matricula);

}
