package com.ajudarobotica.escola;
public class Curso {
    private String nome;
    private Integer duracao;
    private Double preco;

    Curso() {

    }

    Curso(String nome, Integer duracao, Double preco) {
        setNome(nome);
        setDuracao(duracao);
        setPreco(preco);
    }

    String getNome() {
        return this.nome;
    }

    Integer getDuracao() {
        return this.duracao;
    }

    Double getPreco() {
        return this.preco;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    void setPreco(Double preco) {
        this.preco = preco;
    }
}

