// Faca um programa que pergunte em qual turno vc estuda. peca para digitar
// M-Matutino V-Vespertino, N-Noturno e imprima a mensagem: bom dia, boa tarde, boa noite
// ou valor invalido.
package com.java;

import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o turno que voce estuda:");
        String turno = scan.next();

        switch (turno){
            case "m":
            case "M":
            case "manha":
            case "MANHA":
                System.out.println("Bom Dia!"); break;
            case "v":
            case "V":
            case "vespertino":
            case "VESPERTINO":
                System.out.println("Boa Tarde!"); break;
            case "n":
            case "N":
            case "noite":
            case "NOITE":
                System.out.println("Boa Noite!"); break;
            default:
                System.out.println("O Valor nao e valido!!");
        }
       }
}



