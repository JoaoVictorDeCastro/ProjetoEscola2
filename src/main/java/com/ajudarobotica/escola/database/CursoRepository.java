package com.ajudarobotica.escola.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.escola.Curso;

public class CursoRepository {
    List<Curso> cursos = new ArrayList<>();

    public void insert(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getAll() {
        return cursos;
    }
}
