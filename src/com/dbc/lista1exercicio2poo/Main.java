package com.dbc.lista1exercicio2poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaAluno a1 = new MediaAluno();
        System.out.println("digite a nota 1");
        a1.setN1(scanner.nextFloat());
        System.out.println("nota 2");
        a1.setN2(scanner.nextFloat());
        System.out.println("nota 3");
        a1.setN3(scanner.nextFloat());
        System.out.println("nota 4");
        a1.setN4(scanner.nextFloat());

        System.out.println(a1.getMedia());
        a1.status();
    }
}
