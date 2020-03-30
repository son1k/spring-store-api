package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.ComponentScan;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity(name = "produtos")

@ComponentScan
public class Produto {

	public Produto(int codigo_produto, String nome, double preco_de_custo, double preco_de_venda, int estoque_codigo,
			int quantidade, Categoria categoria, String imagem) {
		super();
		this.codigo_produto = codigo_produto;
		this.nome = nome;
		this.preco_de_custo = preco_de_custo;
		this.preco_de_venda = preco_de_venda;
		this.estoque_codigo = estoque_codigo;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.imagem = imagem;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_produto;
	
	@Column (nullable = true)
	private String nome;
	
	@Column(nullable = true)
	private double preco_de_custo;
	
	@Column (nullable = true)
	private double preco_de_venda;
	
	private int estoque_codigo;
	
	@Column (nullable = true)
	private int quantidade;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Categoria categoria;
	
	@Column
	private String imagem;
	
	public Produto() {
		
	}
	
	


	
}
