    // Operador Igualdade
    package com.java;
    import java.util.Scanner;

    public class Ex020 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite sua idade: ");

            int idade = scan.nextInt();
            if (idade <= 17){
                System.out.println(" voce ainda e menor de idade!! ");
            } else {
                System.out.println("Voce ja e de maior!! ");
            }

           }
        }

