package orientaçãoobjeto.lista2poo.lista2exercicio4poo;

public class Main {
    public static void main(String[] args) {
        int numero[] = {30,20,50};
        Numero num = new Numero(numero);
        System.out.println("o indice do vetor onde está a menor posição é: " + num.posicaoMenorNumero());
    }
}
