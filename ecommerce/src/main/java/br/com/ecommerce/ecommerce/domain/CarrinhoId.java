package br.com.ecommerce.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Id;

public class CarrinhoId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int ordem_codigo;
	
	@Id
	private int produto_codigo;

	public CarrinhoId() {
		
	}
	
	public CarrinhoId(int ordem_codigo, int produto_codigo) {
		super();
		this.ordem_codigo = ordem_codigo;
		this.produto_codigo = produto_codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ordem_codigo;
		result = prime * result + produto_codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarrinhoId other = (CarrinhoId) obj;
		if (ordem_codigo != other.ordem_codigo)
			return false;
		if (produto_codigo != other.produto_codigo)
			return false;
		return true;
	}
	
}
