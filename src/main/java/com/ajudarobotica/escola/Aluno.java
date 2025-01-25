package com.ajudarobotica.escola;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno implements IPessoa {

    
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

    @Override
    public String informacoes() {
        return " ";
    }

}
