package com.pombimsjb.loops;

import java.util.Scanner;

/*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
    */
public class Ex4_ParEImpar {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numero;
            int quantidadeNumeros;

            int qtdadePares=0,qtdadeImpares=0;

            System.out.println("Quantidade de números: ");
            quantidadeNumeros=scan.nextInt();

            int contador = 0;
            do{
                System.out.println("Digite o número:");
                numero=scan.nextInt();
                if(numero %2==0){
                    qtdadePares++;
                }else qtdadeImpares++;

                contador++;
            }while(contador<quantidadeNumeros);
            System.out.println("Quantidade de Números Pares: "+qtdadePares);
            System.out.println("Quantidade de Números Ímpares: "+qtdadeImpares);
        }
}
