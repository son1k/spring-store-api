package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.pagamentos.Confirmacao;

@Component
public class ConfirmacaoDTO {

	private int codigo_confirmacao;
	private String codigo_identificador;
	private int pagamento_recebido;
	
	public ConfirmacaoDTO(Confirmacao confirmacao) {
		super();
		this.codigo_confirmacao = confirmacao.getCodigoConfirmacao();
		this.codigo_identificador = confirmacao.getCodigoIdentificador();
		this.pagamento_recebido = confirmacao.getPagamentoRecebido();
	}

	public int getCodigo_confirmacao() {
		return codigo_confirmacao;
	}

	public void setCodigo_confirmacao(int codigo_confirmacao) {
		this.codigo_confirmacao = codigo_confirmacao;
	}

	public String getCodigo_identificador() {
		return codigo_identificador;
	}

	public void setCodigo_identificador(String codigo_identificador) {
		this.codigo_identificador = codigo_identificador;
	}

	public int getPagamento_recebido() {
		return pagamento_recebido;
	}

	public void setPagamento_recebido(int pagamento_recebido) {
		this.pagamento_recebido = pagamento_recebido;
	}
	
	public List<ConfirmacaoDTO> converter(List<Confirmacao> confirmacoes){
		
		return confirmacoes.stream().map(ConfirmacaoDTO::new).collect(Collectors.toList());
	}
	
}
