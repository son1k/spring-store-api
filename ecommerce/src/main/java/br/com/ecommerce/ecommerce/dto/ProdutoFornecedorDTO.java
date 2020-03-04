package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.produtos.ProdutoFornecedor;

@Component
public class ProdutoFornecedorDTO {

	private int produto_codigo;
	private int fornecedor_codigo;
	
	public ProdutoFornecedorDTO(ProdutoFornecedor produtoFornecedor) {
		super();
		this.produto_codigo = produtoFornecedor.getProdutoCodigo();
		this.fornecedor_codigo = produtoFornecedor.getFornecedorCodigo();
	}

	public int getProduto_codigo() {
		return produto_codigo;
	}

	public void setProduto_codigo(int produto_codigo) {
		this.produto_codigo = produto_codigo;
	}

	public int getFornecedor_codigo() {
		return fornecedor_codigo;
	}

	public void setFornecedor_codigo(int fornecedor_codigo) {
		this.fornecedor_codigo = fornecedor_codigo;
	}
	
	public List<ProdutoFornecedorDTO> converter(List<ProdutoFornecedor> produtosFornecedores){
		
		return produtosFornecedores.stream().map(ProdutoFornecedorDTO::new).collect(Collectors.toList());
	}
	
}
