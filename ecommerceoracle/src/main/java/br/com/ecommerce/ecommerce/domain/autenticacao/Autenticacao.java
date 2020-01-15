package br.com.ecommerce.ecommerce.domain.autenticacao;

public class Autenticacao {

	private String login;
	private String senha;
	private char tipo;
	
	public Autenticacao() {
		
	}
	
	public Autenticacao(String login, String senha, char tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
}