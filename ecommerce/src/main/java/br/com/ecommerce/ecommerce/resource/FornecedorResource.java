package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.FornecedorDAO;
import br.com.ecommerce.ecommerce.domain.produtos.Fornecedor;
import br.com.ecommerce.ecommerce.dto.FornecedorDTO;
import br.com.ecommerce.ecommerce.repository.FornecedorRepository;

@RestController
@RequestMapping("/ecommerce/fornecedores")
public class FornecedorResource {

	@Autowired
	private FornecedorDAO fornecedorDAO;
	
	@Autowired
	private FornecedorDTO fornecedorDTO;
	
	@Autowired
	private Fornecedor fornecedor;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@GetMapping
	public List<FornecedorDTO> listaTodosOsFornecedores(){
		
		return fornecedorDTO.converter(fornecedorDAO.todosOsFornecedores());
	}
	
	@GetMapping("/{codigoFornecedor}")
	public ResponseEntity<FornecedorDTO> listarTodosOsFornecedores(@PathVariable int codigoFornecedor){
		
		Optional<Fornecedor> fornecedor = fornecedorDAO.umFornecedor(codigoFornecedor);
		
		if(fornecedor.isPresent())
			return ResponseEntity.ok(new FornecedorDTO(fornecedor.get()));
		else
			return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public void criar(@RequestBody Fornecedor fornecedor) {
		
		fornecedorRepository.save(fornecedor);
		
	}
	
	@DeleteMapping ("/{codigoFornecedor}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Integer codigo_fornecedor) {
		fornecedorRepository.deleteById(codigo_fornecedor);
		
	}
	
}
