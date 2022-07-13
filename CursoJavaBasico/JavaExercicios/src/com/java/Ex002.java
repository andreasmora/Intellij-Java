    // Faca um programa que peca um numero e entao mostre a msg
    //O NUMERO INFORMADO FOI [NUMERO:]
    package com.java;
    import java.util.Scanner;

    public class Ex002 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero inteiro: ");
            int numero = scan.nextInt();

            System.out.println("O numero informado foi: " + numero);

        }

    }
