package com.ajudarobotica.escola.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajudarobotica.escola.model.Curso;
import com.ajudarobotica.escola.repository.CursoRepository;

@Service
public class CursoService {
    CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }
}
