package com.ajudarobotica.escola.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.escola.Professor;

public class ProfessorRepository {
    List<Professor> professores = new ArrayList<>();
    
    public void insert(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getAll() {
        return professores;    
    }
}
