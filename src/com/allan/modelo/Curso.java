package com.allan.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private int duracao;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adicionar(Aula aula) {
        this.aulas.add(aula);
        duracao += aula.getDuracao();
        ordernarAula(aula);
    }

    private void ordernarAula(Aula aula) {
        aulas.forEach(a -> a.getNumero().compareTo(aula.getNumero()));
        Collections.sort(aulas);
    }

    @Override
    public String toString() {
        return "com.allan.modelo.Curso: " + nome + ", tempo total: " + duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getDuracao() {
        return duracao;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
}
