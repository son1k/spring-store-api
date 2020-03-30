package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.ProdutoFornecedorDAO;
import br.com.ecommerce.ecommerce.dto.ProdutoFornecedorDTO;

@RestController
@RequestMapping("/ecommerce/produtosfornecedores")
public class ProdutoFornecedorResource {
	
	@Autowired
	private ProdutoFornecedorDAO produtoFornecedorDAO;
	
	@Autowired
	private ProdutoFornecedorDTO produtoFornecedorDTO;
	
	@GetMapping
	public List<ProdutoFornecedorDTO> listarTodosOsProdutosFornecedores(){

		return produtoFornecedorDTO.converter(produtoFornecedorDAO.todosOsProdutosFornecedores());
	}
	
	@GetMapping("/{codigoFornecedor}")
	public List<ProdutoFornecedorDTO> listaProdutosPorUmFornecedor(@PathVariable int codigoFornecedor){
		
		return produtoFornecedorDTO.converter(produtoFornecedorDAO.umProdutoFornecedor(codigoFornecedor));
	}
	
}
