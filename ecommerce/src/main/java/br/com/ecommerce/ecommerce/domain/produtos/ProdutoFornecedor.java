package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.ProdutoFornecedorId;

@Entity(name = "produtosfornecedores")
@IdClass(ProdutoFornecedorId.class)
@Component
public class ProdutoFornecedor {

	@Id
	private int produto_codigo;
	
	@Id
	private int fornecedor_codigo;

	public ProdutoFornecedor() {
		
	}
	
	public ProdutoFornecedor(int produtoCodigo, int fornecedorCodigo) {
		super();
		this.produto_codigo = produtoCodigo;
		this.fornecedor_codigo = fornecedorCodigo;
	}

	public int getProdutoCodigo() {
		return produto_codigo;
	}

	public void setProdutoCodigo(int produtoCodigo) {
		this.produto_codigo = produtoCodigo;
	}

	public int getFornecedorCodigo() {
		return fornecedor_codigo;
	}

	public void setFornecedorCodigo(int fornecedorCodigo) {
		this.fornecedor_codigo = fornecedorCodigo;
	}
	
}