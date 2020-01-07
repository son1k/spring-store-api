package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

   
    @Entity
public class Fornecedor {
       
      @Id
      @Column(name="id", nullable=false, unique=true)
      private int id;
      
      @Column(name="nome", nullable=false, unique=true)
      private String nome;
      
      @Column(name="contato", nullable=false, unique=true)
      private String contato;


   public Fornecedor() {
    
    }      
       public String getNome() {
            return nome;
      }
       
      public void setNome(String nome) {
            this.nome= nome;
      }
      
      public String getContato() {
            return contato;
      }
       
      public void setContato(String contato) {
            this.contato= contato;
    }
    }
