package orientaçãoobjeto.exercicio_conta_corrente;

public class ContaPoupanca extends Conta implements Impressao {
    private static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numConta, int agencia, double saldo) {
        super(cliente, numConta, agencia, saldo);
    }

    public void creditarTaxa() {
        setSaldo(getSaldo() * JUROS_MENSAL);
    }

    @Override
    public void imprimir() {
        System.out.println("----------Dados do Cliente----------------");
        System.out.println("Nome Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conya: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("------------------------------------------");
    }
}
