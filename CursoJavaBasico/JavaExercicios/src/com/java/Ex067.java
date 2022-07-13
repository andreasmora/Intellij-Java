    //Faça  um  programa  que  calcule  o  fatorial  de  um  número  inteiro fornecido   pelo   usuário.
    // Ex.:   5!=5.4.3.2.1=120.   A   saída   deve   ser conforme o exemplo abaixo:
    // oFatorial de: 5 o5! =  5 . 4 . 3 . 2 . 1 = 120
    package com.java;
    import java.util.Scanner;

    public class Ex067 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            int numero;

            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            System.out.println("Fatorial de: " + numero);


            System.out.print(numero + "! = ");
            int fatorial = 1;

            for (int i= numero; i>1; i--){
                fatorial *= i;
                System.out.print(i + " . ");
            }
            System.out.print(" . 1 =" + fatorial);

        }
    }
