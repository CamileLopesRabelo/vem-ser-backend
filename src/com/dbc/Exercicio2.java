package com.dbc;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       /* Desenvolver um algoritmo que faça a média de quatro notas e diga se o aluno está aprovado,
       reprovado ou em exame e a média do aluno.
        0 a 5 = reprovado
        5,1 a 6,9 = em exame
        7 a 10 = aprovado */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        float nota1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite a nota 2:");
        float nota2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite a nota 3:");
        float nota3 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite a nota 4:");
        float nota4 = scanner.nextFloat();
        scanner.nextLine();

        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média é: " + media);

        if (media <= 5 ){
            System.out.println("Reprovado!");
        } else if (media >= 5.1 && media <= 6.9) {
            System.out.println("Em Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado!");
        }
    }
}
