package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class AssertionsTest {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};

        Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
    }
    @Test
    void valilarObjetoEstaNullo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("cid", LocalDateTime.of(2020,1,1,1,1,1));
        Assertions.assertNotNull(pessoa);
        //assertNolNull(pessoa);
    }

    @Test
    void validarNumeroDeTiposDeferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor,outroValor);
    }
}
