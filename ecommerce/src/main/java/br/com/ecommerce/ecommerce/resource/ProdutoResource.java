package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.ProdutoDAO;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;
import br.com.ecommerce.ecommerce.dto.ProdutoDTO;
import br.com.ecommerce.ecommerce.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Ecommerce")
@RestController
@RequestMapping("/ecommerce/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@Autowired
	private ProdutoDTO produtoDTO;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@ApiOperation(value = "Retorna uma lista de produtos")
	@GetMapping
	public ResponseEntity<?> listarTodosOsProdutos(){
		
		List<Produto> produto = produtoRepository.findAll();
		
		return !produto.isEmpty() ? ResponseEntity.ok(produto) :ResponseEntity.noContent().build() ;
	}
	
	@ApiOperation(value = "Retorna um produto")
	@GetMapping("/{codigoProduto}")
	public ResponseEntity<ProdutoDTO> listaUmProduto(@PathVariable int codigoProduto){
		
		Optional<Produto> produto = produtoDAO.umProduto(codigoProduto);
		
		if(produto.isPresent())
			return ResponseEntity.ok(new ProdutoDTO(produto.get()));
		else
			return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Cria um novo produto")
	public void criar(@RequestBody Produto produto) {
		
		produtoRepository.save(produto);
		
	}
	
	

}
