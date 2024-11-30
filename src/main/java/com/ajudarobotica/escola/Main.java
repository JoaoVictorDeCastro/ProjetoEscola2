package com.ajudarobotica.escola;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno("joao");
        alunoUm.cpf = "12345678910";
        alunoUm.dataNascimento = "10/10/2000";
        alunoUm.matricula = "123456";

        Aluno alunoDois = new Aluno("pedro", "12345678990");
        System.out.println(alunoDois.informacoes());

        Aula aula1 = new Aula();
        aula1.alunos.add(alunoDois);
        aula1.alunos.add(alunoUm);

        Professor professorUm = new Professor();
        professorUm.cpf = "135345340";
        professorUm.dataNascimento = "10/10/25560";
        professorUm.matricula = "165523";
        
        Usuario usuario1 = new Usuario();
        usuario1.login = "joao";
        usuario1.senha = "234565";
        usuario1.email = "joaovictordecastro@gmail.com";

        usuario1.encryptPassword();
        
    }
}