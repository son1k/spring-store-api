package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.ConfirmacaoDAO;
import br.com.ecommerce.ecommerce.domain.pagamentos.Confirmacao;
import br.com.ecommerce.ecommerce.dto.ConfirmacaoDTO;

@RestController
@RequestMapping("/ecommerce/confirmacoes")
public class ConfirmacaoResource {
	
	@Autowired
	private ConfirmacaoDAO confirmacaoDAO;
	
	@Autowired
	private ConfirmacaoDTO confirmacaoDTO;
	
	@GetMapping
	public List<ConfirmacaoDTO> listarTodasAsConfirmacoes(){
		
		return confirmacaoDTO.converter(confirmacaoDAO.todasAsConfirmacoes());
	}
	
	@GetMapping("/{codigoConfirmacao}")
	public ResponseEntity<ConfirmacaoDTO> listarUmaConfirmacao(@PathVariable int codigoConfirmacao){
		
		Optional<Confirmacao> confirmacao = confirmacaoDAO.umaConfirmacao(codigoConfirmacao);
		
		if(confirmacao.isPresent())
			return ResponseEntity.ok(new ConfirmacaoDTO(confirmacao.get()));
		else
			return ResponseEntity.notFound().build();
	}

}
