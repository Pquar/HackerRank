package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExececaoNaTransferencia(){
    Conta contaOrigen = new Conta(1234,0);
    Conta contaDestino = new Conta(7987,100);

    TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

    Assertions.assertDoesNotThrow(()->
        transferenciaEntreContas.transfere(contaOrigen, contaDestino, 20));
    }
}
