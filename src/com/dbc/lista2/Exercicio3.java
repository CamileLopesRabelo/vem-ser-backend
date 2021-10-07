package com.dbc.lista2;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        float altura;
        int idade;
        float peso;
        int qtdJogadores =0;
        float maiorAltura = 0;
        String jogadorMaisVelho = "";
        int maiorIdade = 0;
        float maisPesado = 0;
        String jogadorMaisPesado = "";
        float somaAltura = 0;

        System.out.println("Qual o nome do jogador? (sair) para finalizar");
        nome = scanner.next();

        while (!Objects.equals(nome, "sair")) {

            System.out.println("Qual o altura?");
            altura = scanner.nextFloat();
            if (altura > maiorAltura){
                maiorAltura = altura;
            }
            somaAltura += altura;

            System.out.println("Qual a idade?");
            idade = scanner.nextInt();
            if (idade > maiorIdade){
                maiorIdade = idade;
                jogadorMaisVelho = nome;
            }
            System.out.println("Qual o peso?");
            peso = scanner.nextFloat();
            if (peso > maisPesado) {
                maisPesado = peso;
                jogadorMaisPesado = nome;

            }
            System.out.println("Qual o nome do jogador? (sair) para finalizar");
            nome = scanner.next();
            qtdJogadores += 1;
        }

        System.out.println("Quantidade de jogadores cadastrados: " + qtdJogadores);
        System.out.println("Altura do maior jogador: " + maiorAltura);
        System.out.println("Jogador mais velho: " + jogadorMaisVelho);
        System.out.println("Jogador mais pesado: " + jogadorMaisPesado);
        System.out.println("Media das alturas: " + somaAltura/qtdJogadores);



    }
}
