package com.ajudarobotica.escola.repository;

import java.util.ArrayList;
import java.util.List;

import com.ajudarobotica.escola.model.Aula;

public class AulaRepository {
    List<Aula> aulas = new ArrayList<>();
    
    public void insert(Aula aula) {
        aulas.add(aula);
    }

    public List<Aula> getAll() {
        return aulas;
    }
}
