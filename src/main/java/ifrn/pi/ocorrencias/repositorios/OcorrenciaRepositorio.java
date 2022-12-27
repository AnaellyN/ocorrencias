package ifrn.pi.ocorrencias.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.ocorrencias.entidades.Ocorrencia;

public interface OcorrenciaRepositorio extends JpaRepository<Ocorrencia, Long> {

}
