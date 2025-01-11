package com.ajudarobotica.escola.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.escola.Aluno;

public class AlunoRepository {
    List<Aluno> alunos = new ArrayList<>();

    public void insert(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAll() {
        return alunos; 
    }

    
}
