package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.OrdemDAO;
import br.com.ecommerce.ecommerce.domain.pagamentos.Ordem;
import br.com.ecommerce.ecommerce.dto.OrdemDTO;

@RestController
@RequestMapping("/ecommerce/ordens")
public class OrdemResource {

	@Autowired
	private OrdemDAO ordemDAO;
	
	@Autowired
	private OrdemDTO ordemDTO;
	
	@GetMapping
	public List<OrdemDTO> listarTodasAsOrdens(){
		
		return ordemDTO.converter(ordemDAO.todasAsOrdens());
	}
	
	@GetMapping("/{codigoOrdem}")
	public ResponseEntity<OrdemDTO> listaUmaOrdem(@PathVariable int codigoOrdem){
		
		Optional<Ordem> ordem = ordemDAO.umaOrdem(codigoOrdem);
		
		if(ordem.isPresent())
			return ResponseEntity.ok(new OrdemDTO(ordem.get()));
		else
			return ResponseEntity.notFound().build();
	}
	
}
