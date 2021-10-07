package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        String valor;

        String vetor [] = new String[20];

        for (i = 0;i < vetor.length;i++) {
            System.out.println("Digite uma palavra:");
            valor = scanner.next();
            vetor[i] = valor;
        }
        for (i = vetor.length - 1; i >= 0;i--) {
            System.out.println(vetor[i]);
        }

    }
}
