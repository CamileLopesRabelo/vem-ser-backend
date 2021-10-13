package orientaçãoobjeto.lista1poo.lista1exercicio3poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Troco cliente1 = new Troco();
        System.out.println("Qual o valor total consumido?");
        cliente1.setVtc(scanner.nextFloat());
        System.out.println("Qual o valor pago pelo cliente?");
        cliente1.setVpc(scanner.nextFloat());

        cliente1.calcularTroco();
    }
}
