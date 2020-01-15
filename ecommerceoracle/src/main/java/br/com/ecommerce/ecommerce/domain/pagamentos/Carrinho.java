package br.com.ecommerce.ecommerce.domain.pagamentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.CarrinhoId;

@Entity(name = "carrinhos")
@IdClass(CarrinhoId.class)
@Component
public class Carrinho {

	@Id
	private int ordem_codigo;
	
	@Id
	private int produto_codigo;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private double desconto;

	public Carrinho() {
		
	}
	
	public Carrinho(int ordemCodigo, int produtoCodigo, int quantidade, double desconto) {
		super();
		this.ordem_codigo = ordemCodigo;
		this.produto_codigo = produtoCodigo;
		this.quantidade = quantidade;
		this.desconto = desconto;
	}

	public int getOrdemCodigo() {
		return ordem_codigo;
	}

	public void setOrdemCodigo(int ordemCodigo) {
		this.ordem_codigo = ordemCodigo;
	}

	public int getProdutoCodigo() {
		return produto_codigo;
	}

	public void setProdutoCodigo(int produtoCodigo) {
		this.produto_codigo = produtoCodigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}