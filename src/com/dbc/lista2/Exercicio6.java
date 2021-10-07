package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor [] = {1,7,9,0,7,45,11,4,23,13};
        int i;

        System.out.println("Digite o numero que procura: ");
        int numero = scanner.nextInt();
        boolean achou = false;

        for (i = 0; i < vetor.length;i++) {
            if (vetor[i] == numero) {
                achou = true;
            }
        }
        if (achou) {
            System.out.println("o número " + numero + " está contido no vetor");
        } else {
            System.out.println("Não existe o número " + numero + " no vetor");
        }
    }
}