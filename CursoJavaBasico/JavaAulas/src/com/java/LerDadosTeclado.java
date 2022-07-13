package com.java;

import java.util.Scanner;

public class LerDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Digite seu nome e sobrenome: ");
        String nomeSobrenome = scan.nextLine();
        System.out.println("Seu nome e sobrenome é: " + nomeSobrenome);
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);*/

        /*System.out.println("Digite sua Altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Digite seu nome, quantidade de filhos, sua Altura, seu Peso, sua Idade: ");
        String nome = scan.next();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        double peso = scan.nextDouble();
        int idade = scan.nextInt();

        System.out.println("Voce Digitou as seguintes informacoes: ");
        System.out.println("seu nome é: " + nome);
        System.out.println("A quantidade de filhos é: " +qtdFilhos);
        System.out.println("Sua altura é: " +altura);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Sua idade é: " + idade);
    }

}