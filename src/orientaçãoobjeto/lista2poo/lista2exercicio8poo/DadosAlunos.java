package orientaçãoobjeto.lista2poo.lista2exercicio8poo;

public class DadosAlunos {

    public int matriculaComMaiorNotaFinal(Aluno alunos[]) {
        int matricula = 0;
        float nf = 0;
        for (Aluno al : alunos) {
            if (al.notafinal() > nf) {
                nf = al.notafinal();
                matricula = al.getMatricula();
            }
        }
        return matricula;
    }

    public float MediaDasNotasFinais(Aluno alunos[]) {
        float somanf = 0;
        for (Aluno al:alunos) {
            somanf += al.notafinal();
        }
        float media = somanf / alunos.length;
        return media;
    }
}


