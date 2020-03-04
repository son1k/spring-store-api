package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;

@Component
public class ProdutoDTO {
	
	private int codigo_produto;
	private String nome;	
	private double preco_de_venda;
	private int quantidade;
	
	public ProdutoDTO(Produto produto) {
		super();
		this.codigo_produto = produto.getCodigoProduto();
		this.nome = produto.getNome();
		this.preco_de_venda = produto.getPrecoDeVenda();
		this.quantidade = produto.getQuantidade();
	}

	public int getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco_de_venda() {
		return preco_de_venda;
	}

	public void setPreco_de_venda(double preco_de_venda) {
		this.preco_de_venda = preco_de_venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public List<ProdutoDTO> converter(List<Produto> produtos){
		
		return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
	}

}
