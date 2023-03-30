package com.pombimsjb.loops;

import java.util.Scanner;
        /*
        Faça um programa que leia 5 números
        e informe o maior número
        e a média desses números.
        */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        int numero;
        int contador=0;
        int maior=0,soma=0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Digite o número: ");
            numero=scan.nextInt();
            soma=soma+numero;
            if(numero>maior) maior = numero;
            contador++;
        }while(contador<5);
        System.out.println("Maior: "+maior);
        System.out.println("Média: "+(soma/5));
    }


}
