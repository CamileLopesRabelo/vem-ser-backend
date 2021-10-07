package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        String produto = scanner.nextLine();
        System.out.println("Valor do produto: ");
        float valorproduto = scanner.nextFloat();
        float desconto = 0.05f;
        float calcdesc;
        float valorComDesconto;
        float valorTotalComDesconto;

        for (int i = 0;i <10;i++) {
            calcdesc = valorproduto * desconto;
            valorComDesconto = valorproduto - calcdesc;
            valorTotalComDesconto = valorComDesconto * (i + 1);
            desconto += 0.05f;
            System.out.println((i + 1) +" x R$ " + String.format("%.2f",valorComDesconto) + " = " + String.format("%.2f",valorTotalComDesconto));

        }

    }
}
