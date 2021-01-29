package br.com.zup.casadocodigo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.casadocodigo.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
	List<Autor> findByNome(String nomeAutor);
}
