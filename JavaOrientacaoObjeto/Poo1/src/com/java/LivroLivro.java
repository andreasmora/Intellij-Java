// crie um classe livro que represente os dados basicos de um livro sem se
//preocupar com a sua finalidade.....
    package com.java;

    public class LivroLivro {
        public static void main(String[] args) {

            Livro livro = new Livro();

            livro.nome = "Mastering ExtJS";
            livro.autor = "Loiane Groner";
            livro.qtdPaginas = 100;
            livro.anoLamcamento = 2015;

            System.out.println("nome do livro: " + livro.nome);
            System.out.println("Autor: " + livro.autor);


        }
    }
