package br.com.ecommerce.ecommerce.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.domain.produtos.Categoria;
import br.com.ecommerce.ecommerce.repository.CategoriaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Ecommerce")
@RestController
@RequestMapping("/ecommerce/categorias")
public class CategotiaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@ApiOperation(value = "Retorna uma lista de categorias")
	@GetMapping
	
	public ResponseEntity<?> listarTodasCategorias(){
		
		List<Categoria> categoria = categoriaRepository.findAll();
		
		return !categoria.isEmpty() ? ResponseEntity.ok(categoria) :ResponseEntity.noContent().build() ;
	}
	
	

}
