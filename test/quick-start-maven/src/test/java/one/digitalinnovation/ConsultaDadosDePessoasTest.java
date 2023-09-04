package one.digitalinnovation;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultaDadosDePessoasTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosParaTest(){
        BancoDeDados.insereDados(new Pessoa("enel", LocalDateTime.of(2000,1,1,1,1,1)));
    }
    @AfterEach
    void removeDadosDoTest(){
        BancoDeDados.removeDados(new Pessoa("enel", LocalDateTime.of(2000,1,1,1,1,1)));;
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosRetornoMais(){
        Assertions.assertTrue(true);
    }
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
