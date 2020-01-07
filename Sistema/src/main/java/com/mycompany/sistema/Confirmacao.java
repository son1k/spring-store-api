
package com.mycompany.sistema;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Confirmacao {
    
     @Id
     @Column(name="id", nullable=false, unique=true)
      private int id;
     
     @Column(name="codigo_pagamento", nullable=false, unique=true)
      private String codigo_pagamento;
     
     @Column(name="codigo_identificador", nullable=false, unique=true)
     private String codigo_identificador;
     
     @Column(name="url_confirmacao", nullable=false, unique=true)
     private String url_confirmacao;
     
     @Column(name="pagamento", nullable=false, unique=true)
     private String pagamento;
     
     public Confirmacao(){
         
         }
     public String getCodigo_Pagamento() {
            return codigo_pagamento;
      }
       
      public void setCodigo_Pagamento(String codigo_pagamento) {
            this.codigo_pagamento= codigo_pagamento;
      }
      
      public String getCodigo_Identificador() {
            return codigo_identificador;
      }
       
      public void setCodigo_Identificador(String codigo_identificador) {
            this.codigo_identificador= codigo_identificador;
      
     }
      
     public String getUrl_Confirmacao() {
            return url_confirmacao;
      }
       
      public void setUrl_Confirmacao(String url_confirmacao) {
            this.url_confirmacao= url_confirmacao;
      }
      
     public String getPagamento() {
            return pagamento;
      }
       
      public void setPagamento(String pagamento) {
            this.pagamento= pagamento;
      }
}