    // tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
    // que calcule seu peso ideal, usando a seguinte formula: ( 72.7* altura ) - 58

    package com.java;
    import java.util.Scanner;

    public class Ex012 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite sua altura: ");
            double altura = scan.nextDouble();

            double pesoideal = ( 72.7 * altura ) - 58;

            System.out.println("O peso ideal e: " + pesoideal);


        }
    }
