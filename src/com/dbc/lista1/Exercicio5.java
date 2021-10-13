package com.dbc.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

    /*Crie um programa que calcule o salário do usuário, para isso será necessário passar o valor da hora em R$,
     o número de horas normais trabalhas, as horas extras (50%), e as horas extras trabalhadas (100%), em seguida
     exiba o salário bruto.*/

        Scanner scanner = new Scanner(System.in);

        final int CARGA_HORARIA_MENSAL = 220;

        System.out.println("Qual o valor do salário mensal?");
        float salarioMensal = scanner.nextFloat();

        System.out.println("Quantas horas normais foram trabalhadas?");
        int horasTrabalhadas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantas horas extras 50% foram trabalhadas?");
        float horasExtras50 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Quantas horas extras 100% foram trabalhadas?");
        float horasExtras100 = scanner.nextFloat();
        scanner.nextLine();

        float valordaHora = salarioMensal / CARGA_HORARIA_MENSAL;

        float calcHE50 = valordaHora * 1.25f;
        float calcHE100 = valordaHora * 2;
        float calcHN = horasTrabalhadas * valordaHora;

        float salarioBruto = calcHN + calcHE50 + calcHE100;
        System.out.println("Valor do Salário Bruto:");
        System.out.printf("%.2f",salarioBruto);






    }
}
