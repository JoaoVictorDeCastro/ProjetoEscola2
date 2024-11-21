
public class Aluno extends Pessoa {

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
