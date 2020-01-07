package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pagamento {
    
     @Id
      @Column(name="id", nullable=false, unique=true)
      private int id;
      
      @Column(name="codigo_ordem", nullable=false, unique=true)
      private String codigo_ordem;
      
      @Column(name="tipo_de_pagamento", nullable=false, unique=true)
      private String tipo_de_pagamento;
      
      @Column(name="valor_total", nullable=false, unique=true)
      private String valor_total;
      
      @Column(name="moeda", nullable=false, unique=true)
      private String moeda;
      
      @Column(name="solicitar_endereco", nullable=false, unique=true)
      private String solicitar_endereco;
      
      @Column(name="url_final_redirecionamento", nullable=false, unique=true)
      private String url_final_redirecionamento;
      
      @Column(name="email_vendedor", nullable=false, unique=true)
      private String email_vendedor;
      
      @Column(name="parcelamento", nullable=false, unique=true)
      private String parcelamento;
      
      @Column(name="timeout", nullable=false, unique=true)
      private String timeout;
      
      @Column(name="codigo_usos_quantidade", nullable=false, unique=true)
      private String codigo_usos_quantidade;
      
      @Column(name="codigo_validade", nullable=false, unique=true)
      private String codigo_validade;
      
      @Column(name="acrescimos", nullable=false, unique=true)
      private String acrescimos;
      
      public Pagamento(){
          
          
      }
      public String getCodigo_Ordem() {
            return codigo_ordem;
      }
       
      public void setCodigo_Ordem(String codigo_ordem) {
            this.codigo_ordem = codigo_ordem;
      }
      
      public String getTipo_De_Pagamento() {
            return tipo_de_pagamento;
      }
       
      public void setTipo_De_Pagamento(String tipo_de_pagamento) {
            this.tipo_de_pagamento = tipo_de_pagamento;
      }
      
      public String getValor_Total() {
            return valor_total;
      }
       
      public void setValor_Total(String valor_total) {
            this.valor_total = valor_total;
      }
      
      public String getMoeda() {
            return moeda;
      }
       
      public void setMoeda(String moeda) {
            this.moeda = moeda;
      }
      
      public String getSolicitar_Endereco() {
            return solicitar_endereco;
      }
       
      public void setSolicitar_Endereco(String solicitar_endereco) {
            this.solicitar_endereco = solicitar_endereco;
      }
      
      public String getUrl_Final_Redirecionamento() {
            return url_final_redirecionamento;
      }
       
      public void setUrl_Final_Redirecionamento(String url_final_redirecionamento) {
            this.url_final_redirecionamento = url_final_redirecionamento;
      }
      
       public String getEmail_Vendedor() {
            return email_vendedor;
      }
       
      public void setEmail_Vendedor(String email_vendedor) {
            this.email_vendedor = email_vendedor;
            
      }
      
       public String getParcelamento() {
            return parcelamento;
      }
       
      public void setParcelamento(String parcelamento) {
            this.parcelamento = parcelamento;
            
      }
      
      public String getTimeOut() {
            return timeout;
      }
       
      public void setTimeOut(String timeout) {
            this.timeout = timeout;
}
      public String getCodigo_Usos_Quantidade() {
            return codigo_usos_quantidade;
      }
       
      public void setCodigo_Usos_Quantidade(String codigo_usos_quantidade) {
            this.codigo_usos_quantidade = codigo_usos_quantidade;
}
      public String getCodigo_Validade() {
            return codigo_validade;
      }
       
      public void setCodigo_Validade(String codigo_validade) {
            this.codigo_validade = codigo_validade;
}
      
      public String getAcrescimos() {
            return acrescimos;
      }
       
      public void setAcrescimos(String acrescimos) {
            this.acrescimos = acrescimos;
      
      }

}

    

