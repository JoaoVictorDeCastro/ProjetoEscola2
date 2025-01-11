package com.ajudarobotica.escola.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.Aula;
import com.ajudarobotica.escola.database.AulaRepository;
import com.google.gson.Gson;

@RestController
public class AulaController {
    Gson gson = new Gson();
    AulaRepository aulaRepository = new AulaRepository();

    @GetMapping("/aulas")
    public String getAulas() {
        List<Aula> response = aulaRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/aulas")
    public void insertAulas(@RequestBody Aula aula)  {
        aulaRepository.insert(aula);
    }
}
