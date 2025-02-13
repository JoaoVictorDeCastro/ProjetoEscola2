package com.ajudarobotica.escola.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.escola.model.Aula;
import com.ajudarobotica.escola.service.AulaService;
import com.google.gson.Gson;

@RestController
public class AulaController {
    Gson gson = new Gson();
    AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

    @GetMapping("/aulas")
    public String getAulas() {
        List<Aula> response = aulaService.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/aulas")
    public void insertAulas(@RequestBody Aula aula)  {
        aulaService.save(aula);
    }
}
