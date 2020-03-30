package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
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


	
}