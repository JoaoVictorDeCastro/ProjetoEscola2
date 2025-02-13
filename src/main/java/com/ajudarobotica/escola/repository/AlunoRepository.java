package com.ajudarobotica.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajudarobotica.escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String> {
    
}