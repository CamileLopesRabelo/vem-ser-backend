package orientaçãoobjeto.lista2exercicio2poo;

import java.util.Scanner;

public class Numero {
    Scanner scanner = new Scanner(System.in);

     private int numEscondido;

     public String adivinha() {
          int num = Integer.MAX_VALUE;
         while (num != this.numEscondido) {
             System.out.println("Digite um numero:");
             this.numEscondido = scanner.nextInt();
             System.out.println("Adivinhe o numero digitado:");
             num = scanner.nextInt();

             if (num < this.numEscondido) {
                 return "Errou, o numero a ser encontrado é maior que o digitado";
             } else if (num > this.numEscondido) {
                 return "Errou, o numero a ser encontrado é menor que o digitado";
             }
         }
         return "Parabéns você acertou!";
     }

    public int getNumEscondido() {
        return numEscondido;
    }

    public void setNumEscondido(int numEscondido) {
        this.numEscondido = numEscondido;
    }
}
