    // Faca um programa que pergunte qto vc ganha por hora e o numero de horas
    // trabalhadas no mes. Calcule e mostre o total do seu salario referido no mes.
    package com.java;
    import java.util.Scanner;

    public class Ex008 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com o valor/hora: ");
                double valorHora = scan.nextDouble();

            System.out.println("Entre com a quantidade de horas trabalhadas: ");
                double horas = scan.nextDouble();

            double salario = valorHora * horas;
            System.out.println("O salario e de : " + salario);


        }
    }
