package com.java;

import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char letras = 'A';

        // DADOS NAO PRIMITIVOS OU OBJETOS.
        String texto = "Andre";
        //in.next(); // ler uma palavra
        //in.nextLine(); // ler ate o usuario apertar ENTER.

        // OBJETOS EM JAVA COM JNFORMACAO DOS TIPOS PRIMITIVOS.
        System.out.println("O tipo byte:\n\t tem o intervalo (min, max): " + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE);
        System.out.println("\t tem tamanho (em bytes): " + Byte.BYTES);

        Integer.parseInt("12345656");

    }
}
