package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
    
       
      @Id
      @Column(name="id", nullable=false, unique=true)
      private int id;
      
      @Column(name="nome", nullable=false, unique=true)
      private String nome;
      
      @Column(name="preco_custo", nullable=false, unique=true)
      private String preco_custo;
      
      @Column(name="preco_venda", nullable=false, unique=true)
      private String preco_venda;
      
      @Column(name="estoque", nullable=false, unique=true)
      private String estoque;
      
      @Column (name= "quantidade", nullable=false, unique=true)
      private String quantidade;
      
      public Produto() {
    }
      
      public String getNome() {
            return nome;
      }
       
      public void setNome(String nome) {
            this.nome= nome;
      }
      
       public String getPreco_Custo() {
            return preco_custo;
      }
       
      public void setPreco_Custo(String preco_custo) {
            this.preco_custo= preco_custo;
            
      }
      
       public String getPreco_Venda() {
            return preco_venda;
      }
       
      public void setPreco_Venda(String preco_venda) {
            this.preco_venda= preco_venda;
            
      }
      
       public String getEstoque() {
            return estoque;
      }
       
      public void setEstoque(String estoque) {
            this.estoque= estoque;
            
      }
      
       public String getQuantidade() {
            return quantidade;
      }
       
      public void setQuantidade(String quantidade) {
            this.quantidade= quantidade;
            
      }
}
    

