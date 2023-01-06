package ifrn.pi.ocorrencias.servicos;

import ifrn.pi.ocorrencias.dto.OcorrenciaDto;
import ifrn.pi.ocorrencias.entidades.Ocorrencia;

public interface OcorrenciaServicos {
	void CadastrarOcorrenia(OcorrenciaDto OcorrenciaDto);
	Ocorrencia buscarPorMatricula (String matricula);
	void CadastrarOcorrencia(OcorrenciaDto ocorrenciaDto);

}
