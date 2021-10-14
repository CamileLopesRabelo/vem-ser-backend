package orientaçãoobjeto.exercicio_conta_corrente;

public class ContaPagamento extends Conta implements Impressao {
    private static double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numConta, int agencia, double saldo) {
        super(cliente, numConta, agencia, saldo);
    }

    @Override
    public boolean sacar(double saque) {
       return super.sacar(saque + TAXA_SAQUE);
    }

    @Override
    public boolean transferir(Conta conta, double valor) {
        return super.transferir(conta, valor);
    }

    @Override
    public void imprimir() {
        System.out.println("----------Dados do Cliente----------------");
        System.out.println("Nome Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("------------------------------------------");
    }
}
