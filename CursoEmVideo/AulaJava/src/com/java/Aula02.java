package com.java;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        // ESTRUTURAS CONDICIONAIS.

        double numero1 = 0;
        double numero2 = 0;
        double media = (numero1 + numero2) / 2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero1 = scan.nextDouble();

        System.out.println("Digite outro numero: ");
        numero2 = scan.nextDouble();

        if (media >= 9){
            System.out.println("Parabens!!");
        }



    }
}

