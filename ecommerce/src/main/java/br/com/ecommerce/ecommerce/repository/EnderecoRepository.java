package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.autenticacao.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
