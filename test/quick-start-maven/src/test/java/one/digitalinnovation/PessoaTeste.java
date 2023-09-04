package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {
    @Test
    void deveCalcularIdade(){
        Pessoa ana = new Pessoa("ana", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertEquals(23,ana.getIdade());
    }
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa ana = new Pessoa("ana", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertTrue(ana.maiorDeIdade());

        Pessoa bob = new Pessoa("bob", LocalDateTime.of(2023,1,1,1,1,1));
        Assertions.assertFalse(bob.maiorDeIdade());
    }
}
