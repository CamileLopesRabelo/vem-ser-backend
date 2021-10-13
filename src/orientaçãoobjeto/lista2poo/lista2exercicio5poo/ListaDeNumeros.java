package orientaçãoobjeto.lista2poo.lista2exercicio5poo;

public class ListaDeNumeros {
    private int numeros[];

    public ListaDeNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void percorrerAoContrario() {
        for (int i = numeros.length - 1; i >= 0;i--) {
            System.out.println(numeros[i]);
        }
    }
}
