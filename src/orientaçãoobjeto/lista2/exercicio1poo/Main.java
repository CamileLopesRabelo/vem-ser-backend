package orientaçãoobjeto.lista2.exercicio1poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String nome = scanner.next();
        System.out.println("Qual o preço do produto?");
        float preco = scanner.nextFloat();
        Produto p1 = new Produto(nome,preco);

        float percentualDesconto = 0.05f;
        float valorcomdesconto;

        for (int i = 1;i <= 10;i++){
            valorcomdesconto = p1.aplicarDesconto(percentualDesconto);
            System.out.println(i  +" x R$ " + String.format("%.2f",valorcomdesconto) + " = " +
                    String.format("%.2f",p1.descQtd(percentualDesconto,i)));
            percentualDesconto += 0.05f;
        }


    }
}
