package com.ajudarobotica.escola.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.model.Usuario;
import com.ajudarobotica.escola.service.UsuarioService;
import com.google.gson.Gson;

@RestController
public class UsuarioController {
    Gson gson = new Gson();
    UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String getUsarios() {
        List<Usuario> response = usuarioService.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/usuarios")
    public void insertUsuarios(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
    }

    @DeleteMapping("/usuarios/{matricula}")
    public void deleteUsuarios(@PathVariable("matricula") String matricula) {
        usuarioService.delete(matricula);
    }

    @PutMapping("/usuarios") 
    public Usuario putUsuarios(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }
}
