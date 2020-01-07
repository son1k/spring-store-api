package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estoque {
    
     @Id
     @Column(name="id", nullable=false, unique=true)
      private int id;
     
     @Column(name="nome", nullable=false, unique=true)
      private String nome;
     
     @Column (name="endereco", nullable=false, unique=true)
     private String endereco;
     
      public Estoque() {
    }
      
      public String getNome() {
            return nome;
      }
       
      public void setNome(String nome) {
            this.nome= nome;
      }
      
    public String getEndereco() {
            return endereco;
      }
       
      public void setEndereco(String endereco) {
            this.endereco= endereco;
      }
}
