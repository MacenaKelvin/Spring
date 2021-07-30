package br.org.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojagames.model.Produtos;

public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
	
	public List<Produtos> findAllByDescricaoContainingIgnoreCase( String nome);

}
