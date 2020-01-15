package br.com.ecommerce.ecommerce.domain.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

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

	public Fornecedor() {
		
	}
	
	public Fornecedor(int codigoFornecedor, String nome, int enderecoCodigo) {
		super();
		this.codigo_fornecedor = codigoFornecedor;
		this.nome = nome;
		this.endereco_codigo = enderecoCodigo;
	}

	public int getCodigoFornecedor() {
		return codigo_fornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigo_fornecedor = codigoFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEnderecoCodigo() {
		return endereco_codigo;
	}

	public void setEnderecoCodigo(int enderecoCodigo) {
		this.endereco_codigo = enderecoCodigo;
	}
	 
}