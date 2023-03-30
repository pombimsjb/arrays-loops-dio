package com.pombimsjb.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int numeroFatorial = scan.nextInt();

        int multiplicacao = 1;

        for (int i = numeroFatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(numeroFatorial + "! = "+multiplicacao);
    }
}
