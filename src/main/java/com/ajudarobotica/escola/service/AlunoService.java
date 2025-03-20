package com.ajudarobotica.escola.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.escola.model.Aluno;
import com.ajudarobotica.escola.repository.AlunoRepository;

@Service
public class AlunoService {
    AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void delete(String matricula) {
        alunoRepository.deleteById(matricula);
    }
}
