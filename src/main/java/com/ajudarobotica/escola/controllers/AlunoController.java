package com.ajudarobotica.escola.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.model.Aluno;
import com.ajudarobotica.escola.service.AlunoService;
import com.google.gson.Gson;

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
}
