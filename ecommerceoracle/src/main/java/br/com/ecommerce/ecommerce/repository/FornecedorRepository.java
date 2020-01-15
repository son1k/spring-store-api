package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.produtos.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer>{

}
