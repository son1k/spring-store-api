package br.com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ecommerce.ecommerce.domain.autenticacao.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
