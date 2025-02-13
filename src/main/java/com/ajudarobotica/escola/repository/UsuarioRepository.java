package com.ajudarobotica.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajudarobotica.escola.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
