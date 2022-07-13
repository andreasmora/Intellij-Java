// Temos vagas de emprego para as seguintes areas em TI.
// 1- Infra, 2- Desenvolvimento Web, 3- Desenvolvimento Mobile, 4- seguranca.
// faca o candidato entrar com seu nome e com a vaga desejada.
package com.java;
import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Temos as seguintes vagas de emprego para as areas abaixo: ");
        System.out.println("1 - Infra");
        System.out.println("2 - Desenvolvimento Web");
        System.out.println("3 - Desenvolvimento Mobile");
        System.out.println("4 - Seguranca da Informacao");

        System.out.println("Entre com o numero da area pretendida: ");
        int numero = scan.nextInt();

        switch (numero){
            case 1:
                System.out.println("Temos 03 Vagas, aguarde o envio das instrucoes via Whatsapp."); break;
            case 2:
                System.out.println("Temos 10 vagas, favor enviar seu certificado."); break;
            case 3:
                System.out.println("Temos 10 vagas, favor entrar em contato via fone enviado em seu e-mail."); break;
            case 4:
                System.out.println("Todas as vagas foram preenchidas. Boa sorte da proxima vez!!!"); break;
            default:
                System.out.println("opcao invalida!!"); break;
        }

    }
}
