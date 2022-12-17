package ifrn.pi.ocorrencias.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.pi.ocorrencias.entidades.Funcao;

@Repository
public interface FuncaoRepositorio extends JpaRepository<Funcao, Long>{
	Funcao buscarPorNome(String nome);
}
