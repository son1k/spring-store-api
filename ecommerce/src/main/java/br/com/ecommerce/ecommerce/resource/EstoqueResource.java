package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.EstoqueDAO;
import br.com.ecommerce.ecommerce.domain.produtos.Estoque;
import br.com.ecommerce.ecommerce.dto.EstoqueDTO;

@RestController
@RequestMapping("/ecommerce/estoques")
public class EstoqueResource {
	
	@Autowired
	private EstoqueDAO estoqueDAO;

	@Autowired
	private EstoqueDTO estoqueDTO;
	
	@GetMapping
	public List<EstoqueDTO> listarTodosOsEstoques(){
		
		return estoqueDTO.converter(estoqueDAO.todosOsEstoques());
	}
	
	@GetMapping("/{codigoEstoque}")
	public ResponseEntity<EstoqueDTO> listarUmEstoque(@PathVariable int codigoEstoque){
		
		Optional<Estoque> estoque = estoqueDAO.umEstoque(codigoEstoque);
		
		if(estoque.isPresent())
			return ResponseEntity.ok(new EstoqueDTO(estoque.get()));
		else
			return ResponseEntity.notFound().build();
	}
	
}
