    //  Faca um programa para a leitura de duas notas parciais de um aluno, o programa
    // deve calcular a media alcancada por aluno e apresentar :
    // a mensagem aprovado se a media alcancada for maior ou iguala sete
    // a mensagem reprovado se a media for menor do que sete
    // a mensagem aprovado com distincao se a media for igual a dez.
    package com.java;
    import java.util.Scanner;

    public class Ex021 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a primeira nota: ");
            double nota1 = scan.nextDouble();

            System.out.println("Entre com a segunda nota: ");
            double nota2 = scan.nextDouble();

            double  media = (nota1 + nota2) /2;
            if (media == 10){
                System.out.println("Aprovado com distincao!!");
            } else if (media >= 7) {
                System.out.println("Aprovado!!");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
