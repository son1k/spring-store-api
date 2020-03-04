package br.com.ecommerce.ecommerce.erro;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import javax.naming.ServiceUnavailableException;
import javax.persistence.EntityNotFoundException;

import org.hibernate.hql.internal.ast.QuerySyntaxException;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

@RestControllerAdvice
public class ErroHandler {
	
	//PROBLEMA
	@ExceptionHandler(BadRequest.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public String erro400(BadRequest erro){
		
		return "Verifique se falta algum parâmetro na sua requisição (" + erro.getMessage() + ")."; 
	}
	
	//PROBLEMA
	@ExceptionHandler(Forbidden.class)
	@ResponseStatus(code = HttpStatus.FORBIDDEN)
	public String erro403(Forbidden erro){
		
		return "Verifique se os dados inseridos estão corretos (" + erro.getMessage() + ").";
	}
	
	//PROBLEMA
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String erro404(NotFoundException erro){
		
		return "Sua busca não trouxe resultados (" + erro.getMessage() + ")."; 
	}
	
	//OK
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED)
	public String erro405(HttpRequestMethodNotSupportedException erro){
		
		return "A página não existe (" + erro.getMessage() + ")."; 
	}
	
	//NÃO SEI TESTAR
	@ExceptionHandler(TimeoutException.class)
	@ResponseStatus(code = HttpStatus.REQUEST_TIMEOUT)
	public String erro408(TimeoutException erro){
		
		return "Excedido tempo da requisição (" + erro.getMessage() + ").";
	}
	
//	OK
	@ExceptionHandler(EntityNotFoundException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String erro500(EntityNotFoundException erro){
		
		return "Problemas no servidor ao processar sua requisição (" + erro.getMessage() + ").";
	}
//	OK
	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String erro500II(NoSuchElementException erro){
		
		return "Problemas no servidor ao processar sua requisição (" + erro.getMessage() + ").";
	}
//	OK
	@ExceptionHandler(QuerySyntaxException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String erro500II(QuerySyntaxException erro){
		
		return "Problemas no servidor ao processar sua requisição (" + erro.getMessage() + ").";
	}
	
	//NÃO SEI TESTAR
	@ExceptionHandler(ServiceUnavailableException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String erro503(ServiceUnavailableException erro){
		
		return "Serviço temporariamente indisponível (" + erro.getMessage() + ").";
	}

}
