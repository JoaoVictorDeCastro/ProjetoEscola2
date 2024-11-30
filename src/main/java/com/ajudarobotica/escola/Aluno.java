package com.ajudarobotica.escola;

public class Aluno extends Pessoa implements IPessoa {

    Aluno(String nome){
       this.nome = nome;
    }

    Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String informacoes() {
        // TODO Auto-generated method stub
        
        return " ";
    }

}
