package orientaçãoobjeto.lista2poo.lista2exercicio2poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numero adv1 = new Numero();
//        int num = Integer.MAX_VALUE;
//        while (num != adv1.getNumEscondido()){
//            System.out.println("Digite um numero:");
//            adv1.setNumEscondido(scanner.nextInt());
//            System.out.println("Adivinhe o numero digitado:");
//            num = scanner.nextInt();
            System.out.println(adv1.adivinha());
        }


    }

