package com.ajudarobotica.escola.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.escola.Usuario;

public class UsuarioRepository {
    List<Usuario> usuarios = new ArrayList<>();
    
    public void insert(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getAll() {
        return usuarios;
    }
}
