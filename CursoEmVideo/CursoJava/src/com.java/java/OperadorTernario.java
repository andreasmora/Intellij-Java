package com.java;

public class OperadorTernario {
    public static void main(String[] args) {

        // OPERADOR TERNARIO ( Faz comparacoes compostas ).

        int numero1, numero2, resultado;
        numero1 = 14;
        numero2 = 18;
        resultado = (numero1 > numero2) ? numero1 + numero2:numero1 - numero2;

        System.out.println(resultado);

        String nome1 = "Andre";
        String nome2 = "Andre";
        String nome3 = new String("Andre");
        String resultadoNome;

        //resultadoNome = (nome1 == nome2) ? "igual": "diferente";
        resultadoNome = (nome1.equals(nome3)) ? "igual": "diferente";
        System.out.println(resultadoNome);


    }
}
