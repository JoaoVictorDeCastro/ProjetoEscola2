package com.ajudarobotica.escola.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.Usuario;
import com.ajudarobotica.escola.database.UsuarioRepository;
import com.google.gson.Gson;

@RestController
public class UsuarioController {
    Gson gson = new Gson();
    UsuarioRepository usuarioRepository = new UsuarioRepository();

    @GetMapping("/usuarios")
    public String getUsarios() {
        List<Usuario> response = usuarioRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/usuarios")
    public void insertUsuarios(@RequestBody Usuario usuario) {
        usuarioRepository.insert(usuario);
    }
}
