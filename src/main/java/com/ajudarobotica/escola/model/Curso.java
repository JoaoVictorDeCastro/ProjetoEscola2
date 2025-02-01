package com.ajudarobotica.escola.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Curso {
    @OneToOne
    private Aula aula;
    private String nome;
    private Integer duracao;
    private Double preco;
    @Id
    private String id;

    Curso() {

    }

    Curso(String nome, Integer duracao, Double preco, String id) {
        setNome(nome);
        setDuracao(duracao);
        setPreco(preco);
        setId(id);
    }

    String getId() {
        return this.id;
    }

    String getNome() {
        return this.nome;
    }

    Aula getAula() {
        return this.aula;
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

    void setId(String id) {
        this.id = id;
    }

    void setAula(Aula aula) {
        this.aula = aula;
    }
}

