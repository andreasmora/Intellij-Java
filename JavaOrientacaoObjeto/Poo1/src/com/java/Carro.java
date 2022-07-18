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
        double obterAutonomia() {

            System.out.println("Metodo obterAutonomia foi chamado. ");
            return capCombustivel * consumoCombustivel;
        }
        double calcularCombustivel(double km) {
            double qtdCombustivel = km / consumoCombustivel;

            return qtdCombustivel;
        }

    }
