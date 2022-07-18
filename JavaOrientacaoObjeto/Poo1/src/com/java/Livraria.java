// Usando o resultado do exercicio anterior como base, crie uma classe "Livraria de livro" que
//represente os dados basicos de um livro de uma bibilioteca que pode ser emprestado a leitores.

package com.java;

public class Livraria {
    public static void main(String[] args) {

        LivrariaLivro livro = new LivrariaLivro();

        livro.nome = "Mastering ExtJS";
        livro.autor = " Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do Livro: " + livro.nome);

    }
}
