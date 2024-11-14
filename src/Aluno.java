
public class Aluno {
    String nome;
    String matricula;
    String cpf;
    String dataNascimento;
    String telefone;

    Aluno(String nome){
       this.nome = nome;
    }

    Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    String informacoes(){
        return nome + " " + matricula + " " + cpf + " " + dataNascimento + " " + telefone;
    }
}
