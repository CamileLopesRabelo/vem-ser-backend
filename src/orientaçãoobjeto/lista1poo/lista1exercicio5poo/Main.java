package orientaçãoobjeto.lista1poo.lista1exercicio5poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salario func1 = new Salario();
        System.out.println("Qual o valor da hora trabalhada?");
        func1.setValorHora(scanner.nextFloat());
        System.out.println("Quantas horas normais foram trabalhadas?");
        func1.setHorasNormaisTrabalhadas(scanner.nextInt());
        System.out.println("Quantas horas extras 50%?");
        func1.setHoraExtra50(scanner.nextInt());
        System.out.println("Quantas horas extras 100%?");
        func1.setHoraExtra100(scanner.nextInt());

        System.out.println("valor do salário normal: " + func1.valorHoraNormal());
        System.out.println("valor das horas extras trabalhadas na semana: " + func1.valorHoraExtra50());
        System.out.println("valor das horas extras trabalhadas nos domingos e feriados: " + func1.valorHoraExtra100());
        System.out.println("valor do salário bruto: " + func1.salarioBruto());

    }
}
