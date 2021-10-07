package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int numero;
        int [] vetor = new int[3];

        for (i = 0; i < 3; i++){
            System.out.println("Digite um numero:");
            numero = scanner.nextInt();
            vetor[i] = numero;
        }
        if (vetor[0] < vetor[1] && vetor[0] < vetor[2] ) {
            System.out.println("o menor valor esta na posição 1");
        } else if (vetor[1] < vetor[0] && vetor[1] < vetor[2]) {
            System.out.println("o menor valor esta na posição 2");
        } else if (vetor[2] < vetor[0] && vetor[2] < vetor[1]) {
            System.out.println("o menor valor esta na posição 3");
        }
    }
}
