package ifrn.pi.ocorrencias.servicos;

import java.util.List;

import ifrn.pi.ocorrencias.dto.AlunoDto;
import ifrn.pi.ocorrencias.entidades.Aluno;

public interface AlunoServicos {

	void saveAccount(AlunoDto alunoDto);
	Aluno findUserByCpf(String matricula);
	List<AlunoDto> findAllAccounts();
}
