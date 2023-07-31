package com.allan.modelo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


public class Curso {

    private String nome;
    private String instrutor;
    private int duracao;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> buscador = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adicionar(Aula aula) {
        this.aulas.add(aula);
        this.duracao += aula.getDuracao();
        ordernarAula(aula);
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
        buscador.put(aluno.getMatricula(), aluno);
    }

    public Aluno buscarAluno(int matricula) {
        return buscador.get(matricula);
    }

    private void ordernarAula(Aula aula) {
        this.aulas.forEach(a -> a.getNumero().compareTo(aula.getNumero()));
        Collections.sort(aulas);
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome + ", tempo total: " + this.duracao;
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

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public Map<Integer, Aluno> getBuscador() {
        return Collections.unmodifiableMap(buscador);
    }
}
