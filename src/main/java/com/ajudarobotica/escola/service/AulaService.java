package com.ajudarobotica.escola.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.escola.model.Aula;
import com.ajudarobotica.escola.repository.AulaRepository;

@Service
public class AulaService {
    AulaRepository aulaRepository;

    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    public List<Aula> getAll() {
        return aulaRepository.findAll();
    }

    public Aula save(Aula aula) {
        return aulaRepository.saveAndFlush(aula);
    }
}
