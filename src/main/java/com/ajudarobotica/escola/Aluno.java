package com.ajudarobotica.escola;

public class Aluno extends Pessoa implements IPessoa {

    Aluno() {

    }

    Aluno(String nome, String cpf, String matricula, String dataNascimento, String telefone) {
        setNome(nome);
        setDataNascimento(dataNascimento);
        setCpf(cpf);
        setMatricula(matricula);
        setTelefone(telefone);
    }

    @Override
    public String informacoes() {
        // TODO Auto-generated method stub
        
        return " ";
    }

}
