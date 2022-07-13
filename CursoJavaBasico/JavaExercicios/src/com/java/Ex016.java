    // Faca um programa que peca um valor e mostre na tela se o valor e positivo ou
    // negativo.
    package com.java;
    import java.util.Scanner;

    public class Ex016 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com um numero inteiro: ");
            int num = scan.nextInt();

            if (num >= 0){
                System.out.println("O valor digitado e positivo!! ");
            } else {
                System.out.println("O valor digitado e negativo!! ");
            }
        }
    }
