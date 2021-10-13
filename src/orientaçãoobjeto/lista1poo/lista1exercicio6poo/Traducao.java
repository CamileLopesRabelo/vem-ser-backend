package orientaçãoobjeto.lista1poo.lista1exercicio6poo;

import java.util.Scanner;

public class Traducao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palavra p1 = new Palavra("cachorro","dog");
        Palavra p2 = new Palavra("tempo","time");
        Palavra p3 = new Palavra("amor","love");
        Palavra p4 = new Palavra("cidade","city");
        Palavra p5 = new Palavra("feliz","happy");


        Palavra pp[] = {p1,p2,p3,p4,p5};
        System.out.println("Digite a palavra: ");
        String p = scanner.next();

        boolean achou = false;

        for(Palavra pa:pp) {
            if (pa.equals(p)) {
                System.out.println(pa.retornaSinonimo(p));
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Essa palavra não é valida!");
        }
    }
}
