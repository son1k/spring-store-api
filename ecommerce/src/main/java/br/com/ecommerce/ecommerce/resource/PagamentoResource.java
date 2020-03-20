package br.com.ecommerce.ecommerce.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ecommerce.ecommerce.dao.PagamentoDAO;
import br.com.ecommerce.ecommerce.domain.pagamentos.Pagamento;
import br.com.ecommerce.ecommerce.dto.PagamentoDTO;

@RestController
@RequestMapping("/ecommerce/pagamentos")
public class PagamentoResource {
	
	@Autowired
	private PagamentoDAO pagamentoDAO;
	
	@Autowired
	private PagamentoDTO pagamentoDTO;

	@GetMapping
	public List<PagamentoDTO> listarTodosOsPagamentos(){
		
		return pagamentoDTO.converter(pagamentoDAO.todosOsPagamentos());
	}
	
	@GetMapping("/{codigoPagamento}")
	public ResponseEntity<PagamentoDTO> listarUmPagamento(@PathVariable int codigoPagamento){
		
		Optional<Pagamento> pagamento = pagamentoDAO.umPagamento(codigoPagamento);
		
		if(pagamento.isPresent())
			return ResponseEntity.ok(new PagamentoDTO(pagamento.get()));
		else
			return ResponseEntity.notFound().build();
	}
	
}
