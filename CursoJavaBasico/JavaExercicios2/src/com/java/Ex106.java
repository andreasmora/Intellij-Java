//  ler um vetor A com 20 elementos. Separar os elementos pares e impares de A, utilizando apenas um vetor extra B.
// sugestao: no inicio do vetor B armazene os elementos pares de A e nas posicoes restantes do vetor B armazene de A
// que sao impares.


package com.java;

import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares e impares

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com os valores da posicao A: " + i);
            vetorA[i] = scan.nextInt();
        }

        int posicaoB = 0;

        for (int i=0; i<vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;

            }
        }

        for (int i=0; i<vetorA.length; i++) {

            if (vetorA[i] % 2 != 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;

            }
        }

        System.out.print("Vetor A = ");

        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");

        for (int i=0; i<posicaoB; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

    }
}
