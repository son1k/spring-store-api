package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.pagamentos.Carrinho;

@Component
public class CarrinhoDTO {

	private int ordem_codigo;
	private int produto_codigo;
	private int quantidade;
	
	public CarrinhoDTO(Carrinho carrinho) {
		
		this.ordem_codigo = carrinho.getOrdemCodigo();
		this.produto_codigo = carrinho.getProdutoCodigo();
		this.quantidade = carrinho.getQuantidade();
	}

	public int getOrdem_codigo() {
		return ordem_codigo;
	}

	public void setOrdem_codigo(int ordem_codigo) {
		this.ordem_codigo = ordem_codigo;
	}

	public int getProduto_codigo() {
		return produto_codigo;
	}

	public void setProduto_codigo(int produto_codigo) {
		this.produto_codigo = produto_codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public List<CarrinhoDTO> converter(List<Carrinho> listaDeCarrinhos){
		
		return listaDeCarrinhos.stream().map(CarrinhoDTO::new).collect(Collectors.toList());
	}
	
}