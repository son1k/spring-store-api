package br.com.ecommerce.ecommerce.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Teste {
	
	@GetMapping
	public String quaseLa() {
		
		return "Quase lá! Basta escolher uma opção!!!";
	}
	
	@GetMapping("/ecommerce")
	public String bemVindo() {
		
		return "Bem vindo ao nosso site!";
	}
	
	@GetMapping("/ecommerce/hello")
	public String hello() {
		
		return "No Ar!";
	}

}
