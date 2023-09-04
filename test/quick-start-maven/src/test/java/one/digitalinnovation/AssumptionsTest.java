package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

public class AssumptionsTest {
    @Test
    void validarAlgoSomenteNoUsuarioAna(){
        Assumptions.assumeTrue("ana".equals("ana"));
        Assertions.assertEquals(10,5+5);
    }
}
