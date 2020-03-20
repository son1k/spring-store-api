package br.com.ecommerce.ecommerce.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.config.security.TokenService;
import br.com.ecommerce.ecommerce.domain.autenticacao.Autenticacao;
import br.com.ecommerce.ecommerce.dto.TokenDto;


@RestController
@RequestMapping("/auth")
public class AutenticacaoResource {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody @Valid Autenticacao form){
		UsernamePasswordAuthenticationToken dadosLogin = form.converter();
		try {
		Authentication authentication = authManager.authenticate(dadosLogin);
		String token = tokenService.gerarToken(authentication);
		return ResponseEntity.ok(new TokenDto(token, "Bearer"));
		} catch (AuthenticationException e) {
			return ResponseEntity.badRequest().build();

		}
		
	}

}
