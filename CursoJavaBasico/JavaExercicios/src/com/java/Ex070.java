    //Encontrar números primos é uma tarefa difícil. Faça um programa que gera  uma  lista  dos  números  primos  existentes
    // entre  1  e  um  número inteiro informado pelo usuário
    package com.java;
    import java.util.Scanner;

    public class Ex070 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com um numero:");
            int num = scan.nextInt();
            boolean primo;

            for (int i=1; i<=num; i++) {

                primo = true;

                for (int j=2; j<i; j++) {

                    if (i % j == 0) {
                       primo = false;

                    }
                }

                if (primo) {
                    System.out.println(i);
                }

            }
        }
    }