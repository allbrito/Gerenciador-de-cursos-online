package com.allan.modelo;

import java.util.Objects;
import java.util.Random;

public class Aluno {

    private String nome;
    private Long cpf;
    private int matricula;

    public Aluno(String nome, Long cpf) {
        if (nome.isEmpty() || cpf < 1) {
            throw new NullPointerException("As informações passadas estão inconsistentes");
        }
        this.nome = nome;
        this.cpf = cpf;
        gerarMatricula();
    }

    private void gerarMatricula() {
        this.matricula = new Random().nextInt(10000, 100000);
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + "(" + this.matricula + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getCpf(), aluno.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

    public String getNome() {
        return nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }
}
