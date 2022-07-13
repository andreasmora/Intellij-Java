// Ler um vetor A com 10 elementos e construir um vetor B do mesmo tipo e tamanho. e com os mesmo elementos de A, sendo
// que eles deverao ser invertidos, ou seja, o primeiro elemento de A passa a ser o ultimo de B. e o segundo de A passa
// a ser o penultimo de B e assim por diante.

package com.java;

import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o numero das posicoes:  " +i);
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i];
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
