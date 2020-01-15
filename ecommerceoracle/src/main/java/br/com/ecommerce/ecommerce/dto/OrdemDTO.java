package br.com.ecommerce.ecommerce.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.ecommerce.ecommerce.domain.pagamentos.Ordem;

@Component
public class OrdemDTO {
	
	private int codigo_ordem;
	private String tipo;
	private String cupom;
	
	public OrdemDTO(Ordem ordem) {
		super();
		this.codigo_ordem = ordem.getCodigoOrdem();
		this.tipo = ordem.getTipo();
		this.cupom = ordem.getCupom();
	}

	public int getCodigo_ordem() {
		return codigo_ordem;
	}

	public void setCodigo_ordem(int codigo_ordem) {
		this.codigo_ordem = codigo_ordem;
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
	
	public List<OrdemDTO> converter(List<Ordem> ordens){
		
		return ordens.stream().map(OrdemDTO::new).collect(Collectors.toList());
	}

}
