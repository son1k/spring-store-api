package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity(name = "estoques")
@Component
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_estoque;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private int endereco_codigo;

	public Estoque() {
		
	}
	
	public Estoque(int codigoEstoque, String descricao, int enderecoCodigo) {
		super();
		this.codigo_estoque = codigoEstoque;
		this.descricao = descricao;
		this.endereco_codigo = enderecoCodigo;
	}

	public int getCodigoEstoque() {
		return codigo_estoque;
	}

	public void setCodigoEstoque(int codigoEstoque) {
		this.codigo_estoque = codigoEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEnderecoCodigo() {
		return endereco_codigo;
	}

	public void setEnderecoCodigo(int enderecoCodigo) {
		this.endereco_codigo = enderecoCodigo;
	}
	
}