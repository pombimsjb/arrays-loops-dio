package com.pombimsjb.loops;

public class Ex9_ProgressaoGeometrica {
    public static void main(String[] args) {
        int inicial=1,quociente=2,pgn=inicial,valor_max=32;
        System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_max );
        while(pgn<=valor_max){
            System.out.println(pgn);
            pgn*=quociente;
        }
    }
}
