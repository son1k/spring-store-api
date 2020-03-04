package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.EnderecoDAO;
import br.com.ecommerce.ecommerce.domain.autenticacao.Endereco;
import br.com.ecommerce.ecommerce.dto.EnderecoDTO;
import br.com.ecommerce.ecommerce.repository.EnderecoRepository;

@RestController
@RequestMapping("/ecommerce/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoDAO enderecoDAO;
	
	@Autowired
	private EnderecoDTO enderecoDTO;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@GetMapping
	public List<EnderecoDTO> listarTodosOsEnderecos(){
					
		return enderecoDTO.converter(enderecoDAO.todosOsEnderecos());
	}
	
	@GetMapping("/{codigoEndereco}")
	public ResponseEntity<EnderecoDTO> listarUmEndereco(@PathVariable int codigoEndereco) {
		
		Optional<Endereco> endereco = enderecoDAO.umEndereco(codigoEndereco);
		
		if(endereco.isPresent())
			return ResponseEntity.ok(new EnderecoDTO(endereco.get()));
		else
			return ResponseEntity.notFound().build();
	}

}
