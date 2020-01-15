package br.com.ecommerce.ecommerce.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.pagamentos.Pagamento;

@Component
public class PagamentoDTO {
	
	private int codigo_pagamento;
	private int ordem_codigo;
	private String tipo_de_pagamento;
	private double valor_total;
	private int parcelamento;
	private int timeout;
	private Date codigo_validade;
	private double acrescimos;
	
	public PagamentoDTO(Pagamento pagamento) {
		super();
		this.codigo_pagamento = pagamento.getCodigoPagamento();
		this.ordem_codigo = pagamento.getOrdemCodigo();
		this.tipo_de_pagamento = pagamento.getTipoDePagamento();
		this.valor_total = pagamento.getValorTotal();
		this.parcelamento = pagamento.getParcelamento();
		this.timeout = pagamento.getTimeout();
		this.codigo_validade = pagamento.getCodigoValidade();
		this.acrescimos = pagamento.getAcrescimos();
	}

	public int getCodigo_pagamento() {
		return codigo_pagamento;
	}

	public void setCodigo_pagamento(int codigo_pagamento) {
		this.codigo_pagamento = codigo_pagamento;
	}

	public int getOrdem_codigo() {
		return ordem_codigo;
	}

	public void setOrdem_codigo(int ordem_codigo) {
		this.ordem_codigo = ordem_codigo;
	}

	public String getTipo_de_pagamento() {
		return tipo_de_pagamento;
	}

	public void setTipo_de_pagamento(String tipo_de_pagamento) {
		this.tipo_de_pagamento = tipo_de_pagamento;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
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

	public Date getCodigo_validade() {
		return codigo_validade;
	}

	public void setCodigo_validade(Date codigo_validade) {
		this.codigo_validade = codigo_validade;
	}

	public double getAcrescimos() {
		return acrescimos;
	}

	public void setAcrescimos(double acrescimos) {
		this.acrescimos = acrescimos;
	}
	
	public List<PagamentoDTO> converter(List<Pagamento> pagamentos){
		
		return pagamentos.stream().map(PagamentoDTO::new).collect(Collectors.toList());
	}

}
