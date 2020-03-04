package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.pagamentos.Confirmacao;

public interface ConfirmacaoRepository extends JpaRepository<Confirmacao, Integer> {

}
