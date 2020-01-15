package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity(name = "produtos")
@Component
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_produto;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private double preco_de_custo;
	
	@Column(nullable = false)
	private double preco_de_venda;
	
	private int estoque_codigo;
	
	@Column(nullable = false)
	private int quantidade;

	public Produto() {
		
	}
	
	public Produto(int codigoProduto, String nome, double precoDeCusto, double precoDeVenda, int estoqueCodigo,
			int quantidade) {
		super();
		this.codigo_produto = codigoProduto;
		this.nome = nome;
		this.preco_de_custo = precoDeCusto;
		this.preco_de_venda = precoDeVenda;
		this.estoque_codigo = estoqueCodigo;
		this.quantidade = quantidade;
	}

	public int getCodigoProduto() {
		return codigo_produto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigo_produto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoDeCusto() {
		return preco_de_custo;
	}

	public void setPrecoDeCusto(double precoDeCusto) {
		this.preco_de_custo = precoDeCusto;
	}

	public double getPrecoDeVenda() {
		return preco_de_venda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.preco_de_venda = precoDeVenda;
	}

	public int getEstoqueCodigo() {
		return estoque_codigo;
	}

	public void setEstoqueCodigo(int estoqueCodigo) {
		this.estoque_codigo = estoqueCodigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
