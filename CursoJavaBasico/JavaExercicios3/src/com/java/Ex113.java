//elabore um programa em java que solicite um numero ao usuario e leia esse numero. Em seguida exiba todos os numeros
// de 0 ate o numero digitado.


package com.java;

import java.util.Scanner;

public class Ex113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("digite um numero inteiro: ");
        numero = scan.nextInt();

        // OPCAO FOR.
        /*for (int i=0; i<=numero; i++){
            System.out.println("-" + i);
        } */

        // OPCAO WHILE.

        int i=0;
        while (i <=numero){
            System.out.println("-" + i);
            i++; // importante. se loop while esquecermos de colocar essa funcao i++, ele vai entrar em loop
            // infinito. dando problema.
        }

    }
}
