package br.com.dio.Model;

import java.util.Objects;

public class Gato2 {
    private String nome;
    private String cor;
    private int idade;

    public Gato2() {   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato2 gato2 = (Gato2) o;
        return idade == gato2.idade && Objects.equals(nome, gato2.nome) && Objects.equals(cor, gato2.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato2{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
