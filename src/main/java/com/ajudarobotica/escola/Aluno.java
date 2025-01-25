package com.ajudarobotica.escola;

public class Aluno extends Pessoa implements IPessoa {

    public Aluno() {

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
        return " ";
    }

}
