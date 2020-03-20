package br.com.ecommerce.ecommerce.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.ecommerce.ecommerce.dao.UsuarioDAO;
import br.com.ecommerce.ecommerce.domain.autenticacao.Usuario;
import br.com.ecommerce.ecommerce.dto.UsuarioDTO;

@RestController
@RequestMapping("/ecommerce/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private UsuarioDTO usuarioDTO;
	
	@GetMapping
	public List<UsuarioDTO> listarTodosOsUsuarios(){
		
		List<UsuarioDTO> listaDeUsuarios = usuarioDTO.converter(usuarioDAO.todosOsUsuarios());
					
		return listaDeUsuarios;
	}
	
	@GetMapping("/{codigoUsuario}")
	public ResponseEntity<UsuarioDTO> listarUmUsuario(@PathVariable int codigoUsuario){
		
		Optional<Usuario> usuario = usuarioDAO.umUsuario(codigoUsuario);
		
//		if(usuario.isPresent()) {
			
			return ResponseEntity.ok(new UsuarioDTO(usuario.get()));
//		}			
//		else
//			return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<UsuarioDTO> criarUmUsuario(@RequestBody @Valid Usuario usuario, UriComponentsBuilder uriBuilder) {
		
		usuarioDAO.cadastrar(usuario);
		
		URI uri = uriBuilder.path("/ecommerce/usuarios/{codigoUsuario}").buildAndExpand(usuario.getCodigoUsuario()).toUri();
		
		return ResponseEntity.created(uri).body(new UsuarioDTO(usuario));
	}
	
	@PutMapping("/{codigoUsuario}")
	@Transactional
	public ResponseEntity<UsuarioDTO> alterarUmUsuario(@PathVariable int codigoUsuario, @RequestBody @Valid Usuario novoUsuario) {
					
			usuarioDAO.atualizar(codigoUsuario, novoUsuario);
			return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{codigoUsuario}")
	@Transactional
	public ResponseEntity<?> deletarUmUsuario(@PathVariable int codigoUsuario) {
			
			usuarioDAO.deletar(codigoUsuario);

			return ResponseEntity.ok().build();
	}
	
}
