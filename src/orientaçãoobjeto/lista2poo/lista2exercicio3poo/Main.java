package orientaçãoobjeto.lista2poo.lista2exercicio3poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Jogadores j1 = new Jogadores();
        System.out.println("Qual o nome do jogador?");
        j1.setNome(scanner.next());
        System.out.println("Qual a idade?");
        j1.setIdade(scanner.nextInt());
        System.out.println("Qual o altura?");
        j1.setAltura(scanner.nextFloat());
        System.out.println("Qual o peso?");
        j1.setPeso(scanner.nextFloat());

        Jogadores j2 = new Jogadores();
        System.out.println("Qual o nome do jogador?");
        j2.setNome(scanner.next());
        System.out.println("Qual a idade?");
        j2.setIdade(scanner.nextInt());
        System.out.println("Qual o altura?");
        j2.setAltura(scanner.nextFloat());
        System.out.println("Qual o peso?");
        j2.setPeso(scanner.nextFloat());

        Jogadores j3 = new Jogadores();
        System.out.println("Qual o nome do jogador?");
        j3.setNome(scanner.next());
        System.out.println("Qual a idade?");
        j3.setIdade(scanner.nextInt());
        System.out.println("Qual o altura?");
        j3.setAltura(scanner.nextFloat());
        System.out.println("Qual o peso?");
        j3.setPeso(scanner.nextFloat());
        Jogadores jogadores[] = {j1,j2,j3};
        DadosDosJogadores d1 = new DadosDosJogadores(jogadores);

        System.out.println("Quantidade de jogadores: " + d1.qtdJogadores());
        System.out.println("Altura do maior jogador: " + d1.alturaMaiorJogador());
        System.out.println("Jogador mais pesado: " + d1.jogadorMaisPesado());
        System.out.println("Jogador mais velho: " + d1.jogadorMaisVelho());
        System.out.println("Media das alturas dos jogadores: " + String.format("%2.f",d1.mediaDasAlturas()));


    }
    }
