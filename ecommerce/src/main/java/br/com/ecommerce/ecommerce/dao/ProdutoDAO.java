package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;
import br.com.ecommerce.ecommerce.repository.ProdutoRepository;

@Repository
public class ProdutoDAO {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto> todosOsProdutos(){
		
		return produtoRepository.findAll();
	}
	
	public Optional<Produto> umProduto(int codigoProduto){
		
		return produtoRepository.findById(codigoProduto);
	}

}
