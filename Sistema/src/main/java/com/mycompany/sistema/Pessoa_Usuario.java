package com.mycompany.sistema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa_Usuario {
       
      @Id
      @Column(name="id", nullable=false, unique=true)
      private int id;
      
      @Column(name="codigo_usuario", nullable=false, unique=true)
      private String codigo_usuario;
       
      @Column(name="login", nullable=false, unique=true)
      private String login;
       
      @Column(name="senha", nullable=false, unique=true)
      private String senha;
      
      @Column(name ="nome", nullable=false, unique=true)
      private String nome;
      
      @Column(name="cpf", nullable=false, unique=true)
      private String cpf;
      
      @Column(name="email", nullable=false, unique=true)
      private String email;
      
      @Column(name="tipo", nullable=false, unique=true)
      private String tipo;
      
    
    public Pessoa_Usuario() {
    }
      
       public String getCodigo_Usuario() {
            return codigo_usuario;
      }
       
      public void setCodigo_Usuario(String codigo_usuario) {
            this.codigo_usuario= codigo_usuario;
      }
  
     public String getLogin() {
            return login;
      }
       
      public void setLogin(String login) {
            this.login= login;
      }
       
      public String getSenha() {
            return senha;
      }
       
      public void setSenha(String senha) {
            this.senha = senha;
      }
       
       public String getNome() {
            return nome;
      }
       
      public void setNome(String nome) {
            this.nome= nome;
      }
   
      public String getCPF() {
            return cpf;
      }
       
      public void setCPF(String cpf) {
            this.cpf= cpf;
      }
      
       public String getEmail() {
            return email;
      }
       
      public void setEmail(String email) {
            this.email= email;
      }
       public String getTipo() {
            return tipo;
      }
       
      public void setTipo(String tipo) {
            this.tipo= tipo;
      }
      
}
    

