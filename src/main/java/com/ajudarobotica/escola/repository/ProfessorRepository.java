package com.ajudarobotica.escola.repository;

import java.util.ArrayList;
import java.util.List;

import com.ajudarobotica.escola.model.Professor;

public class ProfessorRepository {
    List<Professor> professores = new ArrayList<>();
    
    public void insert(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getAll() {
        return professores;    
    }
}
