    // Faca um programa que verifique se uma letra digitada é uma vogal ou consoante
    package com.java;
    import java.util.Scanner;

    public class Ex018 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite uma letra: ");
            String letra = scan.next();

           /* if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase ("i") ||
                letra.equalsIgnoreCase("O") ||
                letra.equalsIgnoreCase("u")){
                System.out.println("Vogal! ");
            } else {
                System.out.println("Consoante! ");
            } */

            // OUTRA FORMA DE CHEGAR AO MESMO RESULTADO:

            if (letra.length() > 1) {
                System.out.println(" Nao e uma letra valida!! ");
            } else {
                switch (letra) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U":
                        System.out.println("Vogal! ");
                        break;
                    default:
                        System.out.println("Consoante! ");
                }
            }
        }
    }
