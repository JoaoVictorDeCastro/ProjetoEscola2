public abstract class Pessoa {
    String nome;
    String matricula;
    String cpf;
    String dataNascimento;
    String telefone;

    Boolean ValidarCpf() {
        return this.cpf != null;
    }
}
