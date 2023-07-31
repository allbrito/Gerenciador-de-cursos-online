package com.allan.modelo;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private Integer numero;
    private int duracao;

    public Aula(String titulo, int numero, int duracao) {
        this.titulo = titulo;
        this.numero = numero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "com.allan.modelo.Aula " + numero + ": " + titulo;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.numero.compareTo(outraAula.getNumero());
    }

}
