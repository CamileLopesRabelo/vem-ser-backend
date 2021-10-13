package com.dbc.exercicio4aula5;

public class Main {
    public static void main(String[] args) {
        Subtracao sub1 = new Subtracao();
        System.out.println(sub1.calcula(12,10));
        Soma soma = new Soma();
        System.out.println(soma.calcula(12,10));
        Multiplicacao mult = new Multiplicacao();
        System.out.println(mult.calcula(12,10));
        Divisao div = new Divisao();
        System.out.println(div.calcula(12,2));
    }
}
