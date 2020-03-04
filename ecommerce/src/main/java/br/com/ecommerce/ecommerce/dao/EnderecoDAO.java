package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.autenticacao.Endereco;
import br.com.ecommerce.ecommerce.repository.EnderecoRepository;

@Repository
public class EnderecoDAO {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<Endereco> todosOsEnderecos(){
		
		return enderecoRepository.findAll();
	}
	
	public Optional<Endereco> umEndereco(int codigoEndereco){
		
		return enderecoRepository.findById(codigoEndereco);
	}

}
