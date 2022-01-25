package br.org.generation.farmaciadagalera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.farmaciadagalera.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	List <Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
