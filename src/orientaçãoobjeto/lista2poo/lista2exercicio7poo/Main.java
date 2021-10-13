package orientaçãoobjeto.lista2poo.lista2exercicio7poo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(20);
                System.out.println(matriz[i][j]);
            }
        }
        Matriz m1 = new Matriz(matriz);
        m1.valoresMaioresQue10();

    }
}