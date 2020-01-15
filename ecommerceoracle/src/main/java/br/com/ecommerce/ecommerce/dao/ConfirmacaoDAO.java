package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.pagamentos.Confirmacao;
import br.com.ecommerce.ecommerce.repository.ConfirmacaoRepository;

@Repository
public class ConfirmacaoDAO {
	
	@Autowired
	private ConfirmacaoRepository confirmacaoRepository;
	
	public List<Confirmacao> todasAsConfirmacoes(){
		
		return confirmacaoRepository.findAll();
	}
	
	public Optional<Confirmacao> umaConfirmacao(int codigoConfirmacao){
		
		return confirmacaoRepository.findById(codigoConfirmacao);
	}

}
