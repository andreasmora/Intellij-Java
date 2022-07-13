// Criar um vetor A com 10 elementos inteiros. Construitr um vetor B de mesmo tipo e tamanho. Obedecendo as seguintes
// regras de formatacao: a)B; devera receber 1 quando A, for par; B) devera receber 0 quando Ai for impar.



package com.java;

import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com os valores da posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0; // MODO TERNARIO
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");

        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");

        }
        System.out.println();
    }
}
