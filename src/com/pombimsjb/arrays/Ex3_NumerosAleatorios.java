package com.pombimsjb.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatórios");
        for (int numero:numerosAleatorios) {
            System.out.print(numero+" ");

        }

        System.out.println("\nSucessores dos numeros Aleatórios");
        for (int numero:numerosAleatorios) {
            System.out.print(numero+1+" ");

        }
    }
}
