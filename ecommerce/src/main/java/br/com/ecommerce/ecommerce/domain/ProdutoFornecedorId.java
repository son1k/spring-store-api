package br.com.ecommerce.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Id;

public class ProdutoFornecedorId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int produto_codigo;
	
	@Id
	private int fornecedor_codigo;

	public ProdutoFornecedorId() {
		
	}
	
	public ProdutoFornecedorId(int produto_codigo, int fornecedor_codigo) {
		super();
		this.produto_codigo = produto_codigo;
		this.fornecedor_codigo = fornecedor_codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fornecedor_codigo;
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
		ProdutoFornecedorId other = (ProdutoFornecedorId) obj;
		if (fornecedor_codigo != other.fornecedor_codigo)
			return false;
		if (produto_codigo != other.produto_codigo)
			return false;
		return true;
	}

}
