package com.java;

public class Aula03 {
    public static void main(String[] args) {
        // Unix Time.
        // Calcular horario.

        // comando que retorna a quantidade de milisegundos
        // de 1970 01 de janeiro a 00:00hs
        // calendario marco zero da era Unix.
        long totalMiliSegundos = System.currentTimeMillis() - 10800000;

        long totalSegundos = totalMiliSegundos / 1000;
        long segundoAtual = totalSegundos % 60;
        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos % 60;

        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;

        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);




    }
}
