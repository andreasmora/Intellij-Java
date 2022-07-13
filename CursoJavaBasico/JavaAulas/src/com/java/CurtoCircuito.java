package com.java;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro;
        boolean resultado2 = falso &&
                verdadeiro; // && Curto Circuito.Nesse caso ele nem olha o segundo, pois ja sabe que o resultado é falso.
        System.out.println(resultado1);
        System.out.println(resultado2);
    }

}