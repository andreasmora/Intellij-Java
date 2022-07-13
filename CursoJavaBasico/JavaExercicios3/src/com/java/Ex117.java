// Crie um programa em java que solicite ao usuario um numero e apresente os resultados da
// tabuada desse numero ( ate 10 ).

package com.java;

import java.util.Scanner;

public class Ex117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        char resposta = 's';


        do {

            try {

                System.out.println("--------TABUADA--------");
                System.out.println();

                System.out.println("Digite o numero: ");
                numero = scan.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " * " + i + " = " + (numero * i));

                }

                System.out.println();

                System.out.println("Tabuada do: " + numero);
                System.out.println("---------------");

            }
            catch (Exception ex) {
                System.out.println("Deu Erro!!!" + ex.getMessage());

            }
            do {
                System.out.println("Deseja continuar (S/ N) ? ");
                resposta = scan.next().charAt(0);
            } while (resposta != 's' && resposta != 'n');

        }while (resposta == 's');
        System.out.println("Obrigado!!!");




    }
}