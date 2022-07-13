// Crie um algoritmo que leia 10 numeros e exiba quantos sao maiores que 5 quantos sao pares e quantos sao
//impares.

package com.java;

import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorQueCinco = 0;
        int numPares = 0;
        int numImpares = 0;

        for (int i=1; i<=10; i++) {
            System.out.printf("Digite o %d Numero: ", i);
            numero = scan.nextInt();

            if (numero > 5)
                maiorQueCinco++;
            if (numero % 2 == 0)
                numPares++;
            else
                numImpares++;

        }

            System.out.println("Maiores que cinco: " + maiorQueCinco);
            System.out.println("Numeros pares: " + numPares);
            System.out.println("Numeros impares: " + numImpares);

        }

    }
