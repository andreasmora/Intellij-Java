// Criar um vetor A com 11 elementos, indexados de 0 ate 10. Sendo que cada elemento do vetor A e formado pela potencia
// de base 2 elevado ao expoente igual a posicao do respectivo elemento, ou seja:
// A[i] =2 sugestao: int A[11]


package com.java;

import java.util.Scanner;

public class Ex111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[11];

        for (int i=0; i<vetorA.length; i++){

            vetorA[i] = Math.pow(2, i);

        }


        System.out.print("Vetor A = ");

        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }


        System.out.println();
    }
}
