package br.com.ecommerce.ecommerce.domain.autenticacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity(name = "enderecos")
@Component
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_endereco;
	
	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private int numero;
	
	private String complemento;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private int usuario_codigo;
	
	public Endereco() {
		
	}
	
	public Endereco(int codigoEndereco, String logradouro, int numero, String complemento, String bairro, String cep,
			int usuarioCodigo) {
		super();
		this.codigo_endereco = codigoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.usuario_codigo = usuarioCodigo;
	}

	public int getCodigoEndereco() {
		return codigo_endereco;
	}

	public void setCodigoEndereco(int codigoEndereco) {
		this.codigo_endereco = codigoEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getUsuarioCodigo() {
		return usuario_codigo;
	}

	public void setUsuarioCodigo(int usuarioCodigo) {
		this.usuario_codigo = usuarioCodigo;
	}
	
}