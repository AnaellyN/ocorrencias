package ifrn.pi.ocorrencias.servicos;

import ifrn.pi.ocorrencias.dto.ContaDto;
import ifrn.pi.ocorrencias.entidades.Conta;

public interface ContaServicos {
	void cadastrarConta(ContaDto contadto);
	Conta buscarPorMatricula(String matricula);
}
