package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto_Fornecedor {
    
     @Column(name="produto", nullable=false, unique=true)
      private String produto;
     
     @Column(name="fornecedor", nullable=false, unique=true)
     private String fornecedor;
     
     public Produto_Fornecedor(){
         
     }
       public String getProduto() {
            return produto;
      }
       
      public void setProduto(String produto) {
            this.produto =  produto;
      }
      
      public String getFornecedor() {
            return fornecedor;
      }
       
      public void setFornecedor(String fornecedor) {
            this.fornecedor =  fornecedor;
      }
     }

