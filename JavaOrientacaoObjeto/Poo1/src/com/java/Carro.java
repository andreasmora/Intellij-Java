    package com.java;

    public class Carro {

        String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

        // CRIANDO METODO PARA ESSA CLASSE.

        void exibirAutonomia(){
            System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel + " KM ");

        }

    }
