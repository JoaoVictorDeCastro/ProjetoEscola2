package com.ajudarobotica.escola.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.model.Curso;
import com.ajudarobotica.escola.service.CursoService;
import com.google.gson.Gson;

@RestController
public class CursoController {
    Gson gson = new Gson(); 
    CursoService cursoService;
    
    @GetMapping("/cursos")
    public String getCursos() {
        List<Curso> response = cursoService.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/cursos")
    public void insertCursos(@RequestBody Curso curso) {
        cursoService.save(curso);
    }
}
