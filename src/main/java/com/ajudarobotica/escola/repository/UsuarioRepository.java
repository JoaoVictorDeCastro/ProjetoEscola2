package com.ajudarobotica.escola.repository;

import java.util.ArrayList;
import java.util.List;

import com.ajudarobotica.escola.model.Usuario;

public class UsuarioRepository {
    List<Usuario> usuarios = new ArrayList<>();
    
    public void insert(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getAll() {
        return usuarios;
    }
}
