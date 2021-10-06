package com.dbc;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /*Desenvolver um algoritmo que exiba as seguintes informações, porém o que está sublinhado será
        solicitado ao usuário (por meio do Scanner).
        EXEMPLO: Olá seu nome é João, você tem 16 anos, é da cidade de Florianópolis,
        situada no estado de Santa Catarina.*/

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
