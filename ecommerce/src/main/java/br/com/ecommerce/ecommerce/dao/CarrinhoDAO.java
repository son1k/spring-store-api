package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.pagamentos.Carrinho;
import br.com.ecommerce.ecommerce.repository.CarrinhoRepository;

@Repository
public class CarrinhoDAO {
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;

	public List<Carrinho> todosOsCarrinhos() {
		
		List<Carrinho> listaDeCarrinhos = carrinhoRepository.findAll();
		
		return listaDeCarrinhos;
	}
	
	public List<Carrinho> umCarrinho(int ordemCodigo){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ecommerce");
		
			EntityManager em = emf.createEntityManager();
			
				List<Carrinho> carrinho = em
						.createQuery(("select c from carrinhos c where ordem_codigo = " + ordemCodigo), Carrinho.class)
						.getResultList();				
				
			em.close();
			
		emf.close();
		
		return carrinho;
	}

}
