package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.produtos.ProdutoFornecedor;
import br.com.ecommerce.ecommerce.repository.ProdutoFornecedorRepository;

@Repository
public class ProdutoFornecedorDAO {

	@Autowired
	private ProdutoFornecedorRepository produtoFornecedorRepository;
	
	public List<ProdutoFornecedor> todosOsProdutosFornecedores(){
		
		return produtoFornecedorRepository.findAll();
	}
	
	public List<ProdutoFornecedor> umProdutoFornecedor(int codigoFornecedor){
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ecommerce");
		
			EntityManager em = emf.createEntityManager();
			
				List<ProdutoFornecedor> listaDeProdutoFornecedor = em
						.createQuery(("select p from produtosFornecedores p where fornecedor_codigo = " + codigoFornecedor), 
								ProdutoFornecedor.class)
						.getResultList();
			
			em.close();
		
		emf.close();
	
		return listaDeProdutoFornecedor;
	}
}
