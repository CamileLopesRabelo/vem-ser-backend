package com.dbc;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a cidade que você nasceu");
        String cidadeLocal = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o estado que você nasceu");
        String estado = scanner.nextLine();

        System.out.println("Olá seu nome é " + nome + ", você tem " + idade + " anos, é da cidade de " + cidadeLocal + ", situada no estado de " + estado +".");
    }
}
