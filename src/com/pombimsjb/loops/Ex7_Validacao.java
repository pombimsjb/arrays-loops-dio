package com.pombimsjb.loops;

import java.util.Scanner;

/*      Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v', 'd';
*/
public class Ex7_Validacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        while (true) {
            System.out.println("Informe seu nome:");
            nome = scan.nextLine();
            if (nome.length() > 3) {
                break;
            } else System.out.println("O nome precisa ser maior do que 3 letras.");
        }
        while (true) {
            System.out.println("Informe sua idade:");
            idade = scan.nextInt();
            if (idade > 0 && idade < 150) {
                break;
            }else System.out.println("Olá "+nome+", você precisa ter idade entre 0 e 150 anos.");
        }
        while (true) {
            System.out.println("Informe seu salário:");
            salario = scan.nextDouble();
            if (salario > 0) {
                break;
            }else System.out.println("Olá "+nome+", você já tem "+idade+" anos e precisa ganhar mais do que R$ "+salario+" de salário para sobreviver!");
        }
        System.out.println("Informe o sexo que se identifica: ");
        sexo = scan.next();
        System.out.println("Informe seu estado civil: ");
        estadoCivil = scan.next();
        System.out.println("Olá "+nome+", Obrigado por se cadastrar.\n Nome: "+nome+"\n Idade: "+idade+"\n Salário: "+salario
                +"\n Sexo: "+sexo+"\n Estado Civil: "+estadoCivil);
    }

}

