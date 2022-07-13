// criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos de
// vetor A.

package com.java;

import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com os numeros da posicao A: " + i);
            vetorA[i] = scan.nextInt();

        }

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Tabuada de " + vetorA[i]);

            for (int j=1; j<=10; j++){
                System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i]*j));
            }

            System.out.println();

        }


    }
}
