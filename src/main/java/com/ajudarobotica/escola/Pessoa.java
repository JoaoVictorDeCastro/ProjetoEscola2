package com.ajudarobotica.escola;
public abstract class Pessoa {
    private String nome;
    private String matricula;
    private String cpf;
    private String dataNascimento;
    private String telefone;

    Pessoa() {

    }
    
    Pessoa(String nome, String cpf, String matricula, String dataNascimento, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    Boolean ValidarCpf() {
        return this.cpf != null;
    }

    String getNome() {
        return this.nome;
    }

    String getMatricula() {
        return this.matricula;
    }

    String getCpf() {
        return this.cpf;
    }

    String getTelefone() {
        return this.telefone;
    }

    String getDataNascimento() {
        return this.dataNascimento;
    }

    void setNome(String nome) {
        this.nome = nome; 
    }

    void setTelefone(String telefone) {
        this.telefone = telefone; 
    }

    void setCpf(String cpf) {
        this.cpf = cpf; 
    }

    void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento; 
    }

    void setMatricula(String matricula) {
        this.matricula = matricula; 
    }
}
