package ifrn.pi.ocorrencias.servicos;

import java.util.List;

import ifrn.pi.ocorrencias.dto.AlunoDto;

public interface AlunoServicos {

	void cadastrarAluno(AlunoDto alunodto);

	List<AlunoDto> findAllAlunos();
	
	//Aluno findByMatricula(String matricula);

}
