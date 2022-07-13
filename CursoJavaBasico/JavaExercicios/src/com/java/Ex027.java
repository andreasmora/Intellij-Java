// Faca um programa que pergunte em qual turno vc estuda. peca para digitar
// M-Matutino V-Vespertino, N-Noturno e imprima a mensagem: bom dia, boa tarde, boa noite
// ou valor invalido.
package com.java;
import java.util.Scanner;

// mesmo exercicio que o Ex026 so que de outra forma.
public class Ex027 {
    public static void main(String[] args) {

        int turno;
        int opcao = 0;


       System.out.println("Digite 1- Matutino, 2- Vespertino, 3- Noturno.");
        opcao = new Scanner(System.in).nextInt();

        switch (opcao){
            case 1:
                System.out.println("BOM DIA!!"); break;
            case 2:
                System.out.println("BOA TARDE"); break;
            case 3:
                System.out.println("BOA NOITE"); break;
            default:
                System.out.println("Opcao nao e valida!!!");
        }

    }
}

