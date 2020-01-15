package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.produtos.Estoque;

@Component
public class EstoqueDTO {
	
	private int codigo_estoque;
	private String descricao;
	
	public EstoqueDTO(Estoque estoque) {
		super();
		this.codigo_estoque = estoque.getCodigoEstoque();
		this.descricao = estoque.getDescricao();
	}

	public int getCodigo_estoque() {
		return codigo_estoque;
	}

	public void setCodigo_estoque(int codigo_estoque) {
		this.codigo_estoque = codigo_estoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<EstoqueDTO> converter(List<Estoque> estoques){
		
		return estoques.stream().map(EstoqueDTO::new).collect(Collectors.toList());
	}

}
