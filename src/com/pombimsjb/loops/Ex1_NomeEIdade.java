package com.pombimsjb.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {


    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu nome ou digite 0 para encerrar o programa!");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Digite sua idade");
            idade = scan.nextInt();
            System.out.println("Olá "+nome+", você tem "+idade+" anos.");
        }


    }
}
