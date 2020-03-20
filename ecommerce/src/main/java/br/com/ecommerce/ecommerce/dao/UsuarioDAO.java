package br.com.ecommerce.ecommerce.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.ecommerce.ecommerce.domain.autenticacao.Usuario;
import br.com.ecommerce.ecommerce.repository.UsuarioRepository;

@Repository
public class UsuarioDAO {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> todosOsUsuarios(){
		
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> umUsuario(long codigoUsuario){
		
		return usuarioRepository.findById(codigoUsuario);
	}
	
	public void cadastrar(Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	
	public void deletar(long codigoUsuario) {
		
		usuarioRepository.deleteById(codigoUsuario);
	}
	
	public void atualizar(long codigoUsuario, Usuario usuario) {
		
		Usuario novoUsuario = usuarioRepository.getOne(codigoUsuario);
			novoUsuario.setLogin(usuario.getLogin());
			novoUsuario.setSenha(usuario.getSenha());
			novoUsuario.setNome(usuario.getNome());
			novoUsuario.setCpf(usuario.getCpf());
			novoUsuario.setEmail(usuario.getEmail());
			novoUsuario.setTipo(usuario.getTipo());
	}
	
}
