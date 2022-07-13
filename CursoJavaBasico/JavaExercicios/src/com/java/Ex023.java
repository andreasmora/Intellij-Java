    // faca um programa que leia 03 numeros e mostre o maior e o menor deles.
    package com.java;
    import java.util.Scanner;

    public class Ex023 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Voce vera agora os valores de menor e maior!!!");

            System.out.println("Digite o primeiro numero inteiro: ");
            int num1 = scan.nextInt();
            System.out.println("Digite o segundo numero inteiro: ");
            int num2 = scan.nextInt();
            System.out.println("Digite o terceiro numero inteiro: ");
            int num3 = scan.nextInt();

            if (num1 >= num2 && num1 >= num3){
                System.out.println("O primeiro numero e maior: " + num1);
            } else if (num2 >= num1 && num2 >= num3){
                System.out.println("O segundo numero e maior: " + num2);
            } else if (num3 >= num1 && num3 >= num2){
                System.out.println("O terceiro numero e maior: " + num3);
            }

            if (num1 <= num2 && num1 <= num3){
                System.out.println("O primeiro numero e menor: " + num1);
            } else if (num2 <= num1 && num2 <= num3){
                System.out.println("O segundo numero e menor: " + num2);
            } else if (num3 <= num1 && num3 <= num2){
                System.out.println("O terceiro numero e menor: " + num3);
            }
        }
    }
