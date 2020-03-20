package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.produtos.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer>{

}
