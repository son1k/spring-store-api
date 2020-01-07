package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Autenticacao {
    
     @Column(name="login", nullable=false, unique=true)
      private String login;
     
     @Column(name="senha", nullable=false, unique=true)
      private String senha;
     
     @Column(name="tipo", nullable=false, unique=true)
      private String tipo;
     
     public Autenticacao() {
    }
      
       public String getLogin() {
            return login;
      }
       
      public void setLogin(String login) {
            this.login = login;
      }
     
      public String getSenha() {
            return senha;
      }
       
      public void setSenha(String senha) {
            this.senha = senha;
      }
      
     public String getTipo() {
            return tipo;
      }
       
      public void settipo(String tipo) {
            this.tipo = tipo;
      }
}

