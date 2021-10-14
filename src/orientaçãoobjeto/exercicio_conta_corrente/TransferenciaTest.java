package orientaçãoobjeto.exercicio_conta_corrente;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransferenciaTest {
    @Test
    public void deveTestarTransferenciaEVerificarSaldoComSucesso(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        Cliente maicon = new Cliente("Maicon","654.765.765.76");
        ContaCorrente contaCorrenteCamile = new ContaCorrente(camile,"1234",123,1000,1000);
        ContaCorrente contaCorrenteMaicon = new ContaCorrente(maicon,"4566",456,2000,2000);
        //act
        boolean transferir =contaCorrenteCamile.transferir(contaCorrenteMaicon,500);
        double saldo = contaCorrenteCamile.getSaldo();

        //assert
        assertTrue(transferir);
        assertEquals(500,saldo,0);
    }

    @Test
    public void deveTestarTransferenciaSemSaldo(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        Cliente maicon = new Cliente("Maicon","654.765.765.76");
        ContaCorrente contaCorrenteCamile = new ContaCorrente(camile,"1234",123,1000,1000);
        ContaCorrente contaCorrenteMaicon = new ContaCorrente(maicon,"4566",456,2000,2000);
        //act
        boolean transferir =contaCorrenteCamile.transferir(contaCorrenteMaicon,2500);
        double saldo = contaCorrenteCamile.getSaldo();

        //assert
        assertFalse(transferir);
        assertEquals(1000,saldo,0);
    }
}
