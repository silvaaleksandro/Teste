package br.com.dio;

import br.com.dio.Model.Gato2;

public class SegundoPrograma {
    public static void main(String[] args) {
        // write your code here
//
        Gato2 gato = new Gato2();
        System.out.println(gato);

        Livro livro1 = new Livro("Nome Livro", 300);
        System.out.println(livro1);

    }

    static class Livro {

        private String nome;
        private  Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
}