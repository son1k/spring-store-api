package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ordem {
    
    @Id
      @Column(name="id", nullable=false, unique=true)
      private int id;
      
      @Column(name="codigo_cliente", nullable=false, unique=true)
      private String codigo_cliente;
      
      public Ordem(){
          
      }
     public String getCodigo_Cliente() {
            return codigo_cliente;
      }
       
      public void setCodigo_Cliente(String codigo_cliente) {
            this.codigo_cliente = codigo_cliente;
      }
}
