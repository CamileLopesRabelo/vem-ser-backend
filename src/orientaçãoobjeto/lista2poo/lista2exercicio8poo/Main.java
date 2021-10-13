package orientaçãoobjeto.lista2poo.lista2exercicio8poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno camile = new Aluno(1,7,8);
        Aluno jose = new Aluno(2,9,6);
        Aluno ricardo = new Aluno(3,6,9);
        Aluno robson = new Aluno(4,4,6);

        System.out.println("Nota final Camile: " + String.format("%.1f",camile.notafinal()));
        System.out.println("Nota final Jose: " + String.format("%.1f",jose.notafinal()));
        System.out.println("Nota final Ricardo: " + String.format("%.1f",ricardo.notafinal()));
        System.out.println("Nota final Robson: " + String.format("%.1f",robson.notafinal()));

        Aluno alunos[] = {camile,jose,ricardo,robson};
        DadosAlunos d = new DadosAlunos();
        System.out.println("Matricula com maior nota final: " + d.matriculaComMaiorNotaFinal(alunos));
        System.out.println("Media das notas finais: " + d.MediaDasNotasFinais(alunos));


    }
}
