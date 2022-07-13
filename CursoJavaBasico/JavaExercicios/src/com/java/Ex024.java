    // faca um programa que pergunte o preco de 03 produtos e informe qual produto vc deve comprar
    // sabendo que a decisao e sempre pelo mais barato.
    package com.java;
    import java.util.Scanner;

    public class Ex024 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o preco do primeiro produto: ");
            double produto1 = scan.nextDouble();

            System.out.println("Digite o preco do segundo produto: ");
            double produto2 = scan.nextDouble();

            System.out.println("Digite o preco do terceiro produto: ");
            double produto3 = scan.nextDouble();

            if (produto1 <= produto2 && produto1 <= produto3){
                System.out.println("Compre o primeiro produto, pois e o mais barato!! " + produto1);
            } else if (produto2 <= produto1 && produto2 <= produto3) {
                System.out.println("Compre o segundo produto, pois ele e o mais barato!! " + produto2);
            } else if (produto3 <= produto1 && produto3 <= produto2) {
                System.out.println("Compre o terceiro produto, pois ele e o mais barato!! " + produto3);
            }
        }
    }
