package com.ajudarobotica.escola.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Aula {
    @OneToMany
    private Set<Aluno> alunos = new HashSet<>();
    @OneToOne
    private Professor professor;
    @OneToOne
    private Curso curso;
    private String entrada;
    private String saida;
    @Id
    private String id;

    Aula() {

    }

    Aula(Set<Aluno> alunos, Professor professor, Curso curso, String entrada, String saida, String id) {
        setAlunos(alunos);
        setCurso(curso);
        setProfessor(professor);
        setEntrada(entrada);
        setSaida(saida);
        setId(id);
    }

    Set<Aluno> getAlunos() {
        return this.alunos;
    }

    Professor getProfessor() {
        return this.professor;
    }

    Curso getCurso() {
        return this.curso;
    }

    String getEntrada() {
        return this.entrada;
    }

    String getSaida() {
        return this.saida;
    }

    String getId() {
        return this.id;
    }

    void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    void setCurso(Curso curso) {
        this.curso = curso;
    }

    void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    void setSaida(String saida) {
        this.saida = saida;
    }

    void setId(String id) {
        this.id = id;
    }
}
