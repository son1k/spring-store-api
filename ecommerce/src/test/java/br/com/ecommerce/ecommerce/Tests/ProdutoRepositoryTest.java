package br.com.ecommerce.ecommerce.Tests;

import static org.assertj.core.api.Assertions.assertThat;



import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.ecommerce.ecommerce.domain.produtos.Categoria;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;
import br.com.ecommerce.ecommerce.repository.ProdutoRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ProdutoRepositoryTest {

	private Categoria categoria;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void createShouldPersistData() {
		Produto produto = new Produto(1,"teste", 22.0, 21.0, 1, 11, categoria, "teste");
		this.produtoRepository.save(produto);
		Assertions.assertThat(produto.getCodigo_produto()).isNotNull();
		Assertions.assertThat(produto.getNome()).isEqualTo("teste");
		Assertions.assertThat(produto.getPreco_de_custo()).isEqualTo(22.0);
		Assertions.assertThat(produto.getPreco_de_venda()).isEqualTo(21.0);
		Assertions.assertThat(produto.getEstoque_codigo()).isNotNull();
		Assertions.assertThat(produto.getQuantidade()).isEqualTo(11);
		Assertions.assertThat(produto.getCategoria()).isEqualTo(categoria);
		Assertions.assertThat(produto.getImagem()).isEqualTo("teste");
	}
	
	@Test
	public void deleteShouldRemoveData() {
		Produto produto = new Produto(1,"teste", 22.0, 21.0, 1, 11, categoria, "teste");
		this.produtoRepository.save(produto);
		produtoRepository.delete(produto);
		assertThat(produtoRepository.findById(produto.getCodigo_produto()))
				.isEmpty();
	}
	
	@Test
	public void updateShouldChangeAndPersistData() {
		Produto produto = new Produto(1,"teste", 22.0, 21.0, 1, 11, categoria, "teste");
		this.produtoRepository.save(produto);
		produto.setNome("teste1");
		produto.setPreco_de_custo(22.5);
		produto.setPreco_de_venda(20.0);
		produto.setQuantidade(9);
		produto.setImagem("teste2");
		this.produtoRepository.save(produto);
		assertThat(produto.getNome()).isEqualTo("teste1");
		assertThat(produto.getPreco_de_custo()).isEqualTo(22.5);
		assertThat(produto.getPreco_de_venda()).isEqualTo(20.0);
		assertThat(produto.getQuantidade()).isEqualTo(9);
		assertThat(produto.getImagem()).isEqualTo("teste2");
	}
	@Test
	public void findShouldDataExist() {
		Produto produto = new Produto(1,"teste", 22.0, 21.0, 1, 11, categoria, "teste");
		this.produtoRepository.save(produto);
		assertThat(produtoRepository.findAll()).isNotEmpty();
	}
}
