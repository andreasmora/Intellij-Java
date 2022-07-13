// criar um vetor A com 10 elementos inteiros, Escreva um programa que imprima cada elemento do vetor A e uma msg
// indicando se o respectivo elemento e um numero primo ou nao.


package com.java;

import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com os numeros da posicao A: " + i);
            vetorA[i] = scan.nextInt();
        }

        boolean primo;
        String msg;

        for (int i=0; i<vetorA.length; i++) {

            primo = true;
            for (int j=2; j<vetorA[i]; j++){
               if (vetorA[i] % j == 0) {
                   primo = false;
                   break;

               }
            }

            msg = "";

            if (primo){
                msg = " Primo";
            } else {
                msg = " Nao e primo";
            }

            System.out.println(vetorA[i] + msg);

        }

    }
}
