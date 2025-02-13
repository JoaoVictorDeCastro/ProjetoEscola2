package com.ajudarobotica.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajudarobotica.escola.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {

}
