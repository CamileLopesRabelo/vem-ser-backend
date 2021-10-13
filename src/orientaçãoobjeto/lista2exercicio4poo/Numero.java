package orientaçãoobjeto.lista2exercicio4poo;

public class Numero {
    private int num[];

    public Numero(int[] num) {
        this.num = num;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int posicaoMenorNumero() {
        int posicao = 0;
        int mn = Integer.MAX_VALUE;
        for (int i = 0;i < num.length;i++) {
            if (num[i] < mn) {
                mn = num[i];
                posicao = i;
            }
        }
        return posicao;
    }
}
