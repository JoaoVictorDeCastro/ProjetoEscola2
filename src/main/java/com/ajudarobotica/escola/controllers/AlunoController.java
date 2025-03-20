package com.ajudarobotica.escola.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.model.Aluno;
import com.ajudarobotica.escola.service.AlunoService;
import com.google.gson.Gson;

import jakarta.websocket.server.PathParam;

@RestController
public class AlunoController {
    Gson gson = new Gson();
    AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/alunos")
    public String getAlunos() {
        List<Aluno> response = alunoService.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/alunos")
    public void insertAlunos(@RequestBody Aluno aluno) {
        alunoService.save(aluno);
    }

    @DeleteMapping("/alunos/{matricula}") 
    public void deleteAlunos(@PathVariable("matricula") String matricula) {
        alunoService.delete(matricula);
    }

    @PutMapping("/alunos")
    public Aluno putAlunos(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }
}
