package com.ajudarobotica.escola;
import java.util.ArrayList;
import java.util.List;

public class Aula {
    private List <Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Curso curso;
    private String entrada;
    private String saida;

    Aula() {

    }

    Aula(List<Aluno> alunos, Professor professor, Curso curso, String entrada, String saida) {
        setAlunos(alunos);
        setCurso(curso);
        setProfessor(professor);
        setEntrada(entrada);
        setSaida(saida);
    }

    List<Aluno> getAlunos() {
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

    void setAlunos(List<Aluno> alunos) {
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
}
