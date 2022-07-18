// Escreva uma classe para representar um abajur. Desenvolva metodos para
// ligar, desligar o abajur.
    package com.java;

    public class AbajurTeste {
        public static void main(String[] args) {

            Abajur abajur = new Abajur();

            abajur.ligar();
            abajur.mostrarEstado();

            abajur.desligar();
            abajur.mostrarEstado();

            abajur.mudarEstado();
            abajur.mostrarEstado();




        }
    }
