// Numeros palindromos sao aqueles que escritos da Direita para a esquerda tem o mesmo valor quando escritos da
// esquerda para a direita Ex: 545;789987;97379; 123454321; etc. Escreva um programa que verifique se um dado
// vetor A de 10 elementos inteiros é um palindromo, ou seja se o primeiro elemento do vetor e igual ao ultimno
// se o segundo elemento do vetor e igual ao penultimo e assim por diante. ate verificar todos os elementos ou chegar
// a conclusao que o vetor nao e um palindromo.


package com.java;

import java.util.Scanner;

public class Ex099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com um numero para a posicao: " + i);
            vetorA[i] = scan.nextInt();
        }
        // 1221
        // i = 2

        boolean palindromo = true;
        for (int i=0; i<(vetorA.length / 2); i++){

            if (vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        if (palindromo){
            System.out.println("Palindromo!!");
        } else {
            System.out.println("Nao Palindromo!!");
        }
    }
}
