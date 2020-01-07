package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Carrinho {
    
    @Column(name="codigo_ordem", nullable=false, unique=true)
      private String codigo_ordem;
      
    @Column(name="codigo_produto", nullable=false, unique=true)
      private String codigo_produto;
      
    @Column(name="quantidade", nullable=false, unique=true)
      private String quantidade;
    
    @Column(name="desconto", nullable=false, unique=true)
      private String desconto;
    

   public Carrinho(){

 }
      public String getCodigo_Ordem() {
            return codigo_ordem;
      }
       
      public void setCodigo_Ordem(String codigo_ordem) {
            this.codigo_ordem = codigo_ordem;
      }
      
      public String getCodigo_Produto() {
            return codigo_produto;
      }
       
      public void setCodigo_Produto(String codigo_produto) {
            this.codigo_produto = codigo_produto;
      }
      
      public String getQuantidade() {
            return quantidade;
      }
       
      public void setQuantidade(String quantidade) {
            this.quantidade = quantidade;
            
      }
      
       
      public String getDesconto() {
            return quantidade;
      }
       
      public void setDesconto(String desconto) {
            this.desconto = desconto;
            
}
}