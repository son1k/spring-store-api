package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ecommerce.domain.ProdutoFornecedorId;
import br.com.ecommerce.ecommerce.domain.produtos.ProdutoFornecedor;

public interface ProdutoFornecedorRepository extends JpaRepository<ProdutoFornecedor, ProdutoFornecedorId>{

}
