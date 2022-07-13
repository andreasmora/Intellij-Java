// Criar um vetor A com 10 elementos inteiros. Construitr um vetor B de mesmo tipo e tamanho. Obedecendo as seguintes
// regras de formatacao: A)Bi devera receber 'a' quando Ai for menor que 7; B) Bi devera receber 'b' quando Ai for igual
// a 7; C) Bi devera receber 'c' quando Ai for maior que 7 e menor que 10; d) Bi devera receber 'd' quando Ai for igual
// a 10; e) Bi devera receber 'e' quando Ai for maior que 10. SUGESTAO: char B[10].



package com.java;

import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com os numeros das posicoes: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if (vetorA[i]== 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }
        }
        System.out.print("Vetor A = ");

        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = Letras da tabela ASCII = ");

        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
    }
}
