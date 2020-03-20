package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.pagamentos.Pagamento;
import br.com.ecommerce.ecommerce.repository.PagamentoRepository;

@Repository
public class PagamentoDAO {
	
	@Autowired
	PagamentoRepository pagamentoRepository;

	public List<Pagamento> todosOsPagamentos(){
		
		return pagamentoRepository.findAll();
	}
	
	public Optional<Pagamento> umPagamento(int codigoPagamento){
		
		return pagamentoRepository.findById(codigoPagamento);
	}
	
}
