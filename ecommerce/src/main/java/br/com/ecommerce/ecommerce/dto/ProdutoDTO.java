package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import br.com.ecommerce.ecommerce.domain.produtos.Categoria;
import br.com.ecommerce.ecommerce.domain.produtos.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@ComponentScan
public class ProdutoDTO {
	
	public ProdutoDTO(Produto produto) {
		// TODO Auto-generated constructor stub
	}
	private int codigo_produto;
	private String nome;	
	private double preco_de_venda;
	private int quantidade;
	private Categoria categoria;
	
	public void Categoria() {}
	
	
}
