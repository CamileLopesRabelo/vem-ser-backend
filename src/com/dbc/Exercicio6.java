package com.dbc;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*Criar um tradutor que traduza as seguintes palavras de inglês para português e de português para inglês.
            Cachorro Dog
            Tempo Time
            Amor Love
            Cidade City
            Feliz Happy
        OBS: Caso o usuário informe alguma outra palavra o programa deverá informar a seguinte mensagem:
        Essa palavra não é válida.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra a ser traduzida: ");
        String palavra = scanner.nextLine();
        palavra = palavra.toUpperCase();

        switch (palavra) {
            case "CACHORRO":
                System.out.println("A tradução de " + palavra + " em inglês é Dog");
                break;

            case "DOG":
                System.out.println("A tradução de " + palavra + " em português é Cachorro");
                break;

            case "TEMPO":
                System.out.println("A tradução de " + palavra + " em inglês é Time");
                break;

            case "TIME":
                System.out.println("A tradução de " + palavra + " em português é Tempo");
                break;

            case "AMOR":
                System.out.println("A tradução de " + palavra + " em inglês é Love");
                break;

            case "LOVE":
                System.out.println("A tradução de " + palavra + " em português é Amor");
                break;

            case "CIDADE":
                System.out.println("A tradução de " + palavra + " em inglês é City");
                break;

            case "CITY":
                System.out.println("A tradução de " + palavra + " em portugês é Cidade");
                break;

            case "FELIZ":
                System.out.println("A tradução de " + palavra + " em inglês é Happy");
                break;

            case "HAPPY":
                System.out.println("A tradução de " + palavra + " em português é Feliz");
                break;

            default:
                System.out.println("Essa palavra não é válida");
                break;

        }
    }
}
