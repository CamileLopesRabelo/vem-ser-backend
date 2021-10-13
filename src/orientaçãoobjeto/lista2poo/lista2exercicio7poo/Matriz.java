package orientaçãoobjeto.lista2poo.lista2exercicio7poo;

public class Matriz {
    private int matriz[][];

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void valoresMaioresQue10() {
        int vm10 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > 10) {
                    vm10++;
                }
            }

        }
        System.out.println("quantidade de numeros maiores que 10: " + vm10);
    }
}
