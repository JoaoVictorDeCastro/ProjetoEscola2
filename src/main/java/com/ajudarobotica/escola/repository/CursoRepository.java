package com.ajudarobotica.escola.repository;

import java.util.ArrayList;
import java.util.List;

import com.ajudarobotica.escola.model.Curso;

public class CursoRepository {
    List<Curso> cursos = new ArrayList<>();

    public void insert(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getAll() {
        return cursos;
    }
}
