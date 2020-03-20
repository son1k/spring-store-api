package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.produtos.Fornecedor;

@Component
public class FornecedorDTO {

	private int codigo_fornecedor;
	private String nome;
	
	public FornecedorDTO(Fornecedor fornecedor) {
		super();
		this.codigo_fornecedor = fornecedor.getCodigo_fornecedor();
		this.nome = fornecedor.getNome();
	}

	public int getCodigo_fornecedor() {
		return codigo_fornecedor;
	}

	public void setCodigo_fornecedor(int codigo_fornecedor) {
		this.codigo_fornecedor = codigo_fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<FornecedorDTO> converter(List<Fornecedor> fornecedores){
		
		return fornecedores.stream().map(FornecedorDTO::new).collect(Collectors.toList());
	}
	
}
