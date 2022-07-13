// Faca um programa que leia 03 numeros e mostre-os em ordem decrescente
package com.java;
import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Voce vera abaixo os 03 numeros em ordem decrescente!!");

        System.out.println("Digite um numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite mais um numero inteiro: ");
        int num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            //num1 e menor
            //num3 e maior
            //num1 < num2 < num3
            System.out.println(num3 + "--" + num2 + "--" + num1);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            //num1 e menor
            //num2 e maior
            //num1 < num3 < num2
            System.out.println(num2 + "--" + num3 + "--" + num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            //num2 e menor
            //num3 e maior
            //num2 < num1 < num3
            System.out.println(num3 + "--" + num1 + "--" + num2);
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            //num2 e menor
            //num1 e maior
            //num2 < num3 < num1
            System.out.println(num1 + "--" + num3 + "--" + num2);
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            //num3 e menor
            //num2 e maior
            //num3 < num1 < num2
            System.out.println(num2 + "--" + num1 + "--" + num3);
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
            //num3 e menor
            //num1 e maior
            //num3 < num2 < num1
            System.out.println(num1 + "--" + num2 + "--" + num3);
        }
    }
}