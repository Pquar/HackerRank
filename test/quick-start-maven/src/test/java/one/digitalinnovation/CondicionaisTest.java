package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    public class AssumptionsTest {
        @Test
        //se o usuario for root desative o test
        //@DisabledIfEnvironmentVariable(named = "USER", matches = "root")

        //Roda so no linux
        //@EnabledOnOs(OS.LINUX)

        //Roda so no Mac e Linux
        //@EnabledOnOs({OS.MAC OS.LINUX})

        //Versao do java para rodar
       // @EnabledOnJre(JRE.JAVA_18)

        //Range de versoes do java
       // @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)

        //So faz os teste se o usuario for proqu
        //@EnabledIfEnvironmentVariable(named = "USER", matches = "proqu")
        void validarAlgoSomenteNoUsuarioAna(){
            Assumptions.assumeFalse("ana".equals("ana"));
            Assertions.assertEquals(10,5+5);
        }
}
}
