package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Endereco {
    
      @Column(name="lougradouro", nullable=false, unique=true)
      private String logradouro;
      
      @Column(name="numero", nullable=false, unique=true)
      private String numero;
      
      @Column(name="bairro", nullable=false, unique=true)
      private String bairro;
      
      @Column(name="CEP", nullable=false, unique=true)
      private String cep;
      
      @Column (name="complemento", nullable=false, unique=true)
      private String complemento;

      
      public Endereco(){
          
      }
      public String getLogradouro() {
            return logradouro;
      }
       
      public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
      }
      
      public String getNumero() {
            return numero;
      }
       
      public void setNumero(String numero) {
            this.numero = numero;
      }
       public String getBairro() {
            return bairro;
      }
       
      public void setBairro(String bairro) {
            this.bairro = bairro;
      }
      
       public String getCEP() {
            return cep;
      }
       
      public void setCEP(String cep) {
            this.cep = cep;
      }
      
       public String getComplemento() {
            return complemento;
      }
       
      public void setComplemento(String complemento) {
            this.complemento = complemento;
      }
      
}

