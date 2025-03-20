package com.ajudarobotica.escola.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @DeleteMapping("/cursos/{matricula}")
    public void deleteCursos(@PathVariable("matricula") String matricula) {
        cursoService.delete(matricula);
    }

    @PutMapping("/cursos") 
    public Curso putCursos(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }
}
