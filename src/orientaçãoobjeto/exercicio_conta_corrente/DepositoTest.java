package orientaçãoobjeto.exercicio_conta_corrente;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepositoTest {
    @Test
    public void deveTestarDepositoEVerificarSaldoComSucesso(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaCorrente contaCorrenteCamile = new ContaCorrente(camile,"1234",123,1000,1000);

        //act
        boolean depositar =contaCorrenteCamile.depositar(400);
        double saldo = contaCorrenteCamile.getSaldo();

        //assert
        assertTrue(depositar);
        assertEquals(1400,saldo,0);
    }

    @Test
    public void deveTestarDepositoNegativo(){
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaCorrente contaCorrenteCamile = new ContaCorrente(camile,"1234",123,1000,1000);

        //act
        boolean depositar =contaCorrenteCamile.depositar(-400);
        double saldo = contaCorrenteCamile.getSaldo();

        //assert
        assertFalse(depositar);
        assertEquals(1000,saldo,0);
    }
}
