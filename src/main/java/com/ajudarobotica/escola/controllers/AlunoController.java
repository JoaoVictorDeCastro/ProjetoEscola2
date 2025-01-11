package com.ajudarobotica.escola.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.Aluno;
import com.ajudarobotica.escola.database.AlunoRepository;
import com.google.gson.Gson;

@RestController
public class AlunoController {
    Gson gson = new Gson();
    AlunoRepository alunoRepository = new AlunoRepository();

    @GetMapping("/alunos")
    public String getAlunos() {
        List<Aluno> response = alunoRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/alunos")
    public void insertAlunos(@RequestBody Aluno aluno) {
        alunoRepository.insert(aluno);
    }
}
