package br.com.ecommerce.ecommerce.domain.pagamentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity(name = "ordens")
@Component
public class Ordem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_ordem;
	
	@Column(nullable = false)
	private int usuario_codigo;
	
	@Column(nullable = false)
	private String tipo;
	
	@Column
	private String cupom;
	
	public Ordem() {
		
	}
	
	public Ordem(int codigoOrdem, int usuarioCodigo, String tipo) {
		super();
		this.codigo_ordem = codigoOrdem;
		this.usuario_codigo = usuarioCodigo;
		this.tipo = tipo;
	}
	
	public Ordem(int codigoOrdem, int usuarioCodigo, String tipo, String cupom) {
		super();
		this.codigo_ordem = codigoOrdem;
		this.usuario_codigo = usuarioCodigo;
		this.tipo = tipo;
		this.cupom = cupom;
	}

	public int getCodigoOrdem() {
		return codigo_ordem;
	}

	public void setCodigoOrdem(int codigoOrdem) {
		this.codigo_ordem = codigoOrdem;
	}

	public int getUsuarioCodigo() {
		return usuario_codigo;
	}

	public void setUsuarioCodigo(int usuarioCodigo) {
		this.usuario_codigo = usuarioCodigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}
	
}