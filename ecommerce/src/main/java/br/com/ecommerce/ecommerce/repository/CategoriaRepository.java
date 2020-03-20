package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ecommerce.domain.produtos.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
