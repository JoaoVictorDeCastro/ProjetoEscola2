//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno("joao");
        alunoUm.cpf = "12345678910";
        alunoUm.dataNascimento = "10/10/2000";
        alunoUm.matricula = "123456";

        System.out.println(alunoUm.informacoes());

        Aluno alunoDos = new Aluno("joao", "12345678990");
        System.out.println(alunoDos.informacoes());
    }
}