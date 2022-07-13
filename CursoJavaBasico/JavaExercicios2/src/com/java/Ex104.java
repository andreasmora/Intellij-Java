// ler dois vetores A e B com 10 elementos cada, Construir um vetor C sendo este a juncao dos dois outros vetores.
// Os primeiros 10 elementos de C deverao receber os elementos de A e os ultimos elementos de C deverao receber os
// elementos de B. Desta forma C devera ter o dobro de elementos de A e B ou seja: 20 elementos.


package com.java;

import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com os numeros da posicao A: " + i);
            vetorA[i] = scan.nextInt();

            vetorC[i] = vetorA[i];
        }

        for (int i=0; i<vetorB.length; i++) {
            System.out.println("Entre com os numeros da posicao B: " + i);
            vetorB[i] = scan.nextInt();

            vetorC[vetorA.length + i] = vetorB[i];
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

        System.out.print("Vetor C = ");

        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }

        System.out.println();
    }
}
