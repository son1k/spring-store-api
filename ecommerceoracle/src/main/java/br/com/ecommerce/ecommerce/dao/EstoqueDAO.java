package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.produtos.Estoque;
import br.com.ecommerce.ecommerce.repository.EstoqueRepository;

@Repository
public class EstoqueDAO {
	
	@Autowired
	EstoqueRepository estoqueRepository;
	
	public List<Estoque> todosOsEstoques(){
		
		return estoqueRepository.findAll();
	}
	
	public Optional<Estoque> umEstoque(int codigoEstoque){
		
		return estoqueRepository.findById(codigoEstoque);
	}

}
