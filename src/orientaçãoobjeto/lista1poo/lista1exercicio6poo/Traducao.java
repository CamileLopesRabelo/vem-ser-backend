package orientaçãoobjeto.lista1poo.lista1exercicio6poo;

import java.util.Scanner;

public class Traducao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palavra p1 = new Palavra();
        p1.setIngles("Dog");
        p1.setPortugues("Cachorro");
        Palavra p2 = new Palavra();
        p2.setIngles("Time");
        p2.setPortugues("Tempo");

        Palavra pp[] = {p1,p2};
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
