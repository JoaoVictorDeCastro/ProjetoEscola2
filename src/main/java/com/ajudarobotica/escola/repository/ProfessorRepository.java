package com.ajudarobotica.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajudarobotica.escola.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, String> {

}
