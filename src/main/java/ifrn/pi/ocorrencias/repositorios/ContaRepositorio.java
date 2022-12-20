package ifrn.pi.ocorrencias.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.pi.ocorrencias.entidades.Conta;

@Repository
public interface ContaRepositorio extends JpaRepository<Conta, Long> {
	
	Conta findByMatricula(String matricula);
}
