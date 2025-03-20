package com.ajudarobotica.escola.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.model.Professor;
import com.ajudarobotica.escola.service.ProfessorService;
import com.google.gson.Gson;

@RestController
public class ProfessorController {
    Gson gson = new Gson();
    ProfessorService professorService;

    @GetMapping("/professores")
    public String getProfessores() {
        List<Professor> response = professorService.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/professores")
    public void insertProfessores(@RequestBody Professor professor) {
        professorService.save(professor);
    }

    @DeleteMapping("/professores/{matricula}")
    public void deleteProfessores(@PathVariable("matricula") String matricula) {
        professorService.delete(matricula);
    }

    @PutMapping("/professores") 
    public Professor putProfessores(@RequestBody Professor professor) {
        return professorService.save(professor);
    }
}
