// Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relacao
// de todos os pares de 0 ate o respectivo elemento.

package com.java;

import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com os numeros da posicao A: " + i);
            vetorA[i] = scan.nextInt();

        }

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Analizando o numero: " + vetorA[i]);

            for (int j=2; j<vetorA[i]; j++){
                if (j % 2 == 0){
                System.out.println(j + " e par");
                }
            }
            System.out.println();
        }

    }
}
