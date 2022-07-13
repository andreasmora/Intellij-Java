package com.java;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        // MANEIRA NAO MUITO USADA
        String primeiroNome = "Esta é ";
        String segundoNome = "Uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        // VALOR DE 5
        resultado ++; // QUER DIZER QUE ESTA ADICIONANDO MAIS 01.

        System.out.println(resultado++); // QUER DIZER QUE PRIMEIRO MOSTRA O VALOR DO RESULTADO + 1
        System.out.println(++resultado); // QUER DIZER QUE PRIMEIRO ESTOU ADICIONANDO O VALOR NA STRING PARA DEPOIS MOSTRAR O OUTPUT DELA.

        resultado--;
        System.out.println(resultado);
        System.out.println(resultado--);
        System.out.println(--resultado);

    }
}
