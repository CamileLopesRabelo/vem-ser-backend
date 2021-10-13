package com.dbc.lista1exercicio1poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Qual seu nome?");
        p1.setNome(scanner.next());
        System.out.println("Qual sua idade?");
        p1.setIdade(scanner.nextInt());
        System.out.println("Qual cidade que você mora?");
        p1.setCidade(scanner.next());
        System.out.println("Qual seu estado?");
        p1.setEstado(scanner.next());

        System.out.println("Olá seu nome é " + p1.getNome() + " você tem " + p1.getIdade() +
                " anos, é da cidade de " + p1.getCidade() + " , situada no estado de " + p1.getEstado());
    }
}
