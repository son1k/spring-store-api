package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.autenticacao.Endereco;

@Component
public class EnderecoDTO {

	private int codigo_endereco;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	public EnderecoDTO(Endereco endereco) {
		super();
		this.codigo_endereco = endereco.getCodigoEndereco();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cep = endereco.getCep();
	}

	public int getCodigo_endereco() {
		return codigo_endereco;
	}

	public void setCodigo_endereco(int codigo_endereco) {
		this.codigo_endereco = codigo_endereco;
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
	
	public List<EnderecoDTO> converter(List<Endereco> enderecos){
		
		return enderecos.stream().map(EnderecoDTO::new).collect(Collectors.toList());
	}
	
}
