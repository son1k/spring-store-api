package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ecommerce.domain.CarrinhoId;
import br.com.ecommerce.ecommerce.domain.pagamentos.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, CarrinhoId>{

}
