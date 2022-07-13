    package com.java;

    import java.util.Scanner;

    public class LeituraDeDados {
        public static void main(String[] args) {
            int idade = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite um nome: ");
            String nome = scan.nextLine();
            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();

            if (idade >= 18 && idade <= 60){
                    System.out.println("Maior de idade!!");
                } else if (idade >= 70) {
                    System.out.println("Terceira idade!!");

                } else if (idade < 18) {
                        System.out.println("Menor de idade!!!");
            }


            }
    }




