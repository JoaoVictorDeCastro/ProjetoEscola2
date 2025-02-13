package com.ajudarobotica.escola.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.escola.model.Usuario;
import com.ajudarobotica.escola.repository.UsuarioRepository;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
