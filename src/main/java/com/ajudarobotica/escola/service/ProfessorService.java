package com.ajudarobotica.escola.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.escola.model.Professor;
import com.ajudarobotica.escola.repository.ProfessorRepository;

@Service
public class ProfessorService {
    ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }
}
