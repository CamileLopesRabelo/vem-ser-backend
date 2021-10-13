package orientaçãoobjeto.lista2poo.lista2exercicio6poo;

public class EncontrarNumero {
    private int numeros[];

    public EncontrarNumero(int[] numeros) {
        this.numeros = numeros;
    }

    public void encontreONumero(int numero) {
    boolean achou = false;

    for (int i = 0; i < numeros.length;i++) {
        if (numeros[i] == numero) {
            achou = true;
        }
    }
    if (achou) {
        System.out.println("o número " + numero + " está contido no vetor");
    } else {
        System.out.println("Não existe o número " + numero + " no vetor");
    }
}
}
