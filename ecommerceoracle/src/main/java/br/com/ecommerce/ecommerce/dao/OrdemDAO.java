package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.pagamentos.Ordem;
import br.com.ecommerce.ecommerce.repository.OrdemRepository;

@Repository
public class OrdemDAO {

	@Autowired
	private OrdemRepository ordemRepository;
	
	public List<Ordem> todasAsOrdens(){
		
		return ordemRepository.findAll();
	}
	
	public Optional<Ordem> umaOrdem(int codigoOrdem) {
		
		return ordemRepository.findById(codigoOrdem);
	}
	
}
