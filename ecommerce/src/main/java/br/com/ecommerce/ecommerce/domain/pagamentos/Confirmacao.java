package br.com.ecommerce.ecommerce.domain.pagamentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity(name = "confirmacoes")
@Component
public class Confirmacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_confirmacao;
	
	@Column(nullable = false)
	private int pagamento_codigo;
	
	@Column(nullable = false)
	private String codigo_identificador;
	
	@Column(nullable = false)
	private String url_confirmacao;

	@Column(nullable = false)
	private int pagamento_recebido;
	
	public Confirmacao() {
		
	}
	
	public Confirmacao(int codigoConfirmacao, int pagamentoCodigo, String codigoIdentificador, String urlConfirmacao,
			int pagamentoRecebido) {
		super();
		this.codigo_confirmacao = codigoConfirmacao;
		this.pagamento_codigo = pagamentoCodigo;
		this.codigo_identificador = codigoIdentificador;
		this.url_confirmacao = urlConfirmacao;
		this.pagamento_recebido = pagamentoRecebido;
	}

	public int getCodigoConfirmacao() {
		return codigo_confirmacao;
	}

	public void setCodigoConfirmacao(int codigoConfirmacao) {
		this.codigo_confirmacao = codigoConfirmacao;
	}

	public int getPagamentoCodigo() {
		return pagamento_codigo;
	}

	public void setPagamentoCodigo(int pagamentoCodigo) {
		this.pagamento_codigo = pagamentoCodigo;
	}

	public String getCodigoIdentificador() {
		return codigo_identificador;
	}

	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigo_identificador = codigoIdentificador;
	}

	public String getUrlConfirmacao() {
		return url_confirmacao;
	}

	public void setUrlConfirmacao(String urlConfirmacao) {
		this.url_confirmacao = urlConfirmacao;
	}

	public int getPagamentoRecebido() {
		return pagamento_recebido;
	}

	public void setPagamentoRecebido(int pagamentoRecebido) {
		this.pagamento_recebido = pagamentoRecebido;
	}
	
}