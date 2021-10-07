package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numescondido = 10;
        int numero;

       do {
           System.out.println("Digite um número:");
           numero = scanner.nextInt();
           if (numero < numescondido) {
               System.out.println("Errou, o numero a ser encontrado é maior que o digitado");
           } else if (numero > numescondido) {
               System.out.println("Errou, o numero a ser encontrado é menor que o digitado");
           }
       } while (numero != numescondido);

        System.out.println("Parabéns você acertou!");


    }
}
