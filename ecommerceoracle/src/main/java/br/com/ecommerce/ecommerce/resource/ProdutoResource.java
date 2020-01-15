package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.ProdutoDAO;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;
import br.com.ecommerce.ecommerce.dto.ProdutoDTO;

@RestController
@RequestMapping("/ecommerce/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@Autowired
	private ProdutoDTO produtoDTO;
	
	@GetMapping
	public List<ProdutoDTO> listarTodosOsProdutos(){
		
		return produtoDTO.converter(produtoDAO.todosOsProdutos());
	}
	
	@GetMapping("/{codigoProduto}")
	public ResponseEntity<ProdutoDTO> listaUmProduto(@PathVariable int codigoProduto){
		
		Optional<Produto> produto = produtoDAO.umProduto(codigoProduto);
		
		if(produto.isPresent())
			return ResponseEntity.ok(new ProdutoDTO(produto.get()));
		else
			return ResponseEntity.notFound().build();
	}

}
