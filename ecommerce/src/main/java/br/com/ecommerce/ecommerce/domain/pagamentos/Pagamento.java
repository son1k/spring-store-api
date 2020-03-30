package br.com.ecommerce.ecommerce.domain.pagamentos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity(name = "pagamentos")
@Component
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_pagamento;
	
	@Column(nullable = false)
	private int ordem_codigo;
	
	@Column(nullable = false)
	private String tipo_de_pagamento;
	
	@Column(nullable = false)
	private double valor_total;
	
	@Column(nullable = false)
	private String moeda;
	
	@Column(nullable = false)
	private int solicitar_endereco;
	
	@Column(nullable = false)
	private String url_redirecionamento;
	
	@Column(nullable = false)
	private String email_vendedor;
	
	@Column(nullable = false)
	private int parcelamento;
	
	@Column(nullable = false)
	private int timeout;
	
	@Column(nullable = false)
	private int codigo_quantidade_de_usos;
	
	@Column(nullable = false)
	private Date codigo_validade;
	
	@Column(nullable = false)
	private double acrescimos;

	public Pagamento() {
		
	}
	
	public Pagamento(int codigoPagamento, int ordemCodigo, String tipoDePagamento, double valorTotal, String moeda,
			int solicitarEndereco, String urlRedirecionamento, String emailVendedor, int parcelamento, int timeout,
			int codigoQuantidadeDeUsos, Date codigoValidade, double acrescimos) {
		super();
		this.codigo_pagamento = codigoPagamento;
		this.ordem_codigo = ordemCodigo;
		this.tipo_de_pagamento = tipoDePagamento;
		this.valor_total = valorTotal;
		this.moeda = moeda;
		this.solicitar_endereco = solicitarEndereco;
		this.url_redirecionamento = urlRedirecionamento;
		this.email_vendedor = emailVendedor;
		this.parcelamento = parcelamento;
		this.timeout = timeout;
		this.codigo_quantidade_de_usos = codigoQuantidadeDeUsos;
		this.codigo_validade = codigoValidade;
		this.acrescimos = acrescimos;
	}

	public int getCodigoPagamento() {
		return codigo_pagamento;
	}

	public void setCodigoPagamento(int codigoPagamento) {
		this.codigo_pagamento = codigoPagamento;
	}

	public int getOrdemCodigo() {
		return ordem_codigo;
	}

	public void setOrdemCodigo(int ordemCodigo) {
		this.ordem_codigo = ordemCodigo;
	}

	public String getTipoDePagamento() {
		return tipo_de_pagamento;
	}

	public void setTipoDePagamento(String tipoDePagamento) {
		this.tipo_de_pagamento = tipoDePagamento;
	}

	public double getValorTotal() {
		return valor_total;
	}

	public void setValorTotal(double valorTotal) {
		this.valor_total = valorTotal;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public int getSolicitarEndereco() {
		return solicitar_endereco;
	}

	public void setSolicitarEndereco(int solicitarEndereco) {
		this.solicitar_endereco = solicitarEndereco;
	}

	public String getUrlRedirecionamento() {
		return url_redirecionamento;
	}

	public void setUrlRedirecionamento(String urlRedirecionamento) {
		this.url_redirecionamento = urlRedirecionamento;
	}

	public String getEmailVendedor() {
		return email_vendedor;
	}

	public void setEmailVendedor(String emailVendedor) {
		this.email_vendedor = emailVendedor;
	}

	public int getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(int parcelamento) {
		this.parcelamento = parcelamento;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getCodigoQuantidadeDeUsos() {
		return codigo_quantidade_de_usos;
	}

	public void setCodigoQuantidadeDeUsos(int codigoQuantidadeDeUsos) {
		this.codigo_quantidade_de_usos = codigoQuantidadeDeUsos;
	}

	public Date getCodigoValidade() {
		return codigo_validade;
	}

	public void setCodigoValidade(Date codigoValidade) {
		this.codigo_validade = codigoValidade;
	}

	public double getAcrescimos() {
		return acrescimos;
	}

	public void setAcrescimos(double acrescimos) {
		this.acrescimos = acrescimos;
	}
	
}