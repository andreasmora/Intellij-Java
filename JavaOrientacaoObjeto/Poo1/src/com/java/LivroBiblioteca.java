// Usando o resultado do modelo "livro", como base, crie uma classe "LivrodeBiblioteca" que represente
//os dados basicos de um livro de uma biblioteca que pode ser emprestado a leitores.

    package com.java;

    import java.util.Date;

    public class LivroBiblioteca {
        public static void main(String[] args) {

           Biblioteca livro = new Biblioteca();

            livro.nome = "Mastering ExtJS";
            livro.autor = "Loiane Groner";
            livro.anoLancamento = 2015;

            livro.emprestado = true;
            livro.dataEntrega = new Date();
            livro.emprestadoA = "Loiane";

            System.out.println("Nome do livro = " + livro.nome);
        }
    }
