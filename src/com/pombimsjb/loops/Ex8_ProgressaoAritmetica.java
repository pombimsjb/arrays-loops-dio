package com.pombimsjb.loops;

public class Ex8_ProgressaoAritmetica {
    public static void main(String[] args) {
        int inicial=1,razao=3,pan=inicial,valor_max=20;
        System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao, valor_max );
        while(pan<=valor_max){
            System.out.println(pan);
            pan += razao;
        }
    }
}
