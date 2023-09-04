package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    public static void iniciarConexao(){
        LOGGER.info("inciando conexao");
    }
    public static void finalizarConexao(){
        LOGGER.info("finalizar conexao");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("inseriu dados");
    }
    public static void removeDados(Pessoa pessoa){
        LOGGER.info("remove dados");
    }
}
