package orientaçãoobjeto.exercicio_conta_corrente;

public interface Movimentacao {
    boolean sacar (double saque);
    boolean depositar (double deposito);
    boolean transferir(String conta,double valor);
}
