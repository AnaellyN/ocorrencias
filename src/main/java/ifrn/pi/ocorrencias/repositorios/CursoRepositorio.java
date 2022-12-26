package ifrn.pi.ocorrencias.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.pi.ocorrencias.entidades.Curso;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Long>{

}
