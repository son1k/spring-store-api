package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.pagamentos.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
