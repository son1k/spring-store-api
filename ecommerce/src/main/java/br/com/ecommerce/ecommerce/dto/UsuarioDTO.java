package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.ecommerce.ecommerce.domain.autenticacao.Usuario;

@Component
public class UsuarioDTO {

	private long codigo_usuario;
	private String login;
	private String nome;
	private String cpf;
	private String email;
	
	public UsuarioDTO(Usuario usuario) {
		super();
		this.codigo_usuario = usuario.getCodigoUsuario();
		this.login = usuario.getLogin();
		this.nome = usuario.getNome();
		this.cpf = usuario.getCpf();
		this.email = usuario.getEmail();
	}

	public long getCodigo_usuario() {
		return codigo_usuario;
	}

	public void setCodigo_usuario(int codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<UsuarioDTO> converter(List<Usuario> usuarios){
		
		return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
	}
	
}
