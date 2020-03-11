package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.ecommerce.domain.produtos.Categoria;
import br.com.ecommerce.ecommerce.repository.CategoriaRepository;

@Repository
public class CategoriaDAO {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public List<Categoria> todosAsCategorias(){
		
		return categoriaRepository.findAll();
	}
	
	public Optional<Categoria> umProduto(int id ){
		
		return categoriaRepository.findById(id);
	}
	
	
	//comentando para commitar
	


}
