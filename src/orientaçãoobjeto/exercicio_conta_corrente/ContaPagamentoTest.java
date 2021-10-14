package orientaçãoobjeto.exercicio_conta_corrente;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContaPagamentoTest {

    @Test
    public void deveTestarSaqueContaPagamentoEVerificarSaldoComSucesso(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaPagamento contaPagamentoCamile = new ContaPagamento(camile,"234",456,1000);

        //act
        boolean sacar = contaPagamentoCamile.sacar(400);
        double saldo = contaPagamentoCamile.getSaldo();

        //assert
        assertTrue(sacar);
        assertEquals(595.75,saldo,0);
    }

    @Test
    public void deveTestarSaqueContaPagamentoSemSaldo(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaPagamento contaPagamentoCamile = new ContaPagamento(camile,"234",456,1000);

        //act
        boolean sacar = contaPagamentoCamile.sacar(1000);
        double saldo = contaPagamentoCamile.getSaldo();

        //assert
        assertFalse(sacar);
        assertEquals(1000,saldo,0);
    }
}
