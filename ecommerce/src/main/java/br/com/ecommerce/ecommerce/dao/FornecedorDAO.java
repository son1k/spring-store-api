package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.produtos.Fornecedor;
import br.com.ecommerce.ecommerce.repository.FornecedorRepository;

@Repository
public class FornecedorDAO {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public List<Fornecedor> todosOsFornecedores(){
		
		return fornecedorRepository.findAll();
	}
	
	public Optional<Fornecedor> umFornecedor(int codigoFornecedor){
		
		return fornecedorRepository.findById(codigoFornecedor);
	}

}
