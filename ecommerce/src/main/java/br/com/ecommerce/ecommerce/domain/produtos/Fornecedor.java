package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity(name = "fornecedores")
@Component
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_fornecedor;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int endereco_codigo;


	 
}