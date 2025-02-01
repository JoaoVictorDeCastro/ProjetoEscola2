package com.ajudarobotica.escola.model;

import com.ajudarobotica.escola.IPessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno implements IPessoa {

    @ManyToOne
    private Aula aula;
    private String nome;
    @Id
    private String matricula;
    private String cpf;
    private String dataNascimento;
    private String telefone;

    public Aluno() {

    }
    
    Aluno(String nome, String cpf, String matricula, String dataNascimento, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public Boolean validarCpf() {
        return this.cpf != null;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    Aula getAula() {
        return this.aula;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone; 
    }

    public void setCpf(String cpf) {
        this.cpf = cpf; 
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento; 
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula; 
    }

    void setAula(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String informacoes() {
        return " ";
    }

}
