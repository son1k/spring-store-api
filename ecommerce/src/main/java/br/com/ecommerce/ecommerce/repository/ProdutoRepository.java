package br.com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{



	

}
