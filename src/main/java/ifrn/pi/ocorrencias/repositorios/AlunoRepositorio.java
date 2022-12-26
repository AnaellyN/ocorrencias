package ifrn.pi.ocorrencias.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.pi.ocorrencias.entidades.Aluno;

@Repository 
public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{
	
}
