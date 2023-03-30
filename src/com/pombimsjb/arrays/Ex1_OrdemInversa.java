package com.pombimsjb.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-7, 17, 31, 29, 59, 73};
        // No array utiliza -1 porque o array começa no 0.
        // System.out.println(vetor.length-1);
        int count = 0;
        while (count < (vetor.length - 1)) {
            System.out.println(vetor[count]);
            count++;
        }
        System.out.println("\nVetor: ");
        for (int i = (vetor.length- 1) ; i >= 0;i--){
            System.out.println(vetor[i]+" ");
        }
    }
}
