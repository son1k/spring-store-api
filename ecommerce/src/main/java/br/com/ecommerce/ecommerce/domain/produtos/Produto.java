package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Entity(name = "produtos")
@Component
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_produto;
	
	@Column (nullable = true)
	private String nome;
	
	@Column(nullable = true)
	private double preco_de_custo;
	
	@Column (nullable = true)
	private double preco_de_venda;
	
	private int estoque_codigo;
	
	@Column (nullable = true)
	private int quantidade;


	
}
