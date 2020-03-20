package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.CarrinhoDAO;
import br.com.ecommerce.ecommerce.domain.pagamentos.Carrinho;
import br.com.ecommerce.ecommerce.dto.CarrinhoDTO;
import br.com.ecommerce.ecommerce.repository.CarrinhoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ecommerce/carrinhos")
public class CarrinhoResource {
	
	@Autowired
	private CarrinhoDAO carrinhoDAO;
	
	@Autowired
	private CarrinhoDTO carrinhoDTO;
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;
	
	@GetMapping
	public List<CarrinhoDTO> listaTodosOsCarrinhos(){
		
		List<Carrinho> listaDeCarrinhos = carrinhoDAO.todosOsCarrinhos();
		
		return carrinhoDTO.converter(listaDeCarrinhos);
	}
	
	@GetMapping("/{ordemCodigo}")
	public List<CarrinhoDTO> listaUmCarrinho(@PathVariable int ordemCodigo){
		
		List<Carrinho> carrinho = carrinhoDAO.umCarrinho(ordemCodigo);
		
		return carrinhoDTO.converter(carrinho);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Cria um novo carrinho")
	public void criar(@RequestBody Carrinho carrinho) {
		
		carrinhoRepository.save(carrinho);
		
		
	}

}