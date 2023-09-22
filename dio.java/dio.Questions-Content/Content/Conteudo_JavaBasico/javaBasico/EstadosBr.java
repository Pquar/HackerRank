package javaBasico;

public enum EstadosBr {
    SAO_PAULO("SP", "SAO PAULO"),
    SANTA_CATARINA("SC","SANTA CATARINA"),
    RONDONIA("RO", "RONDONIA");

    private String nome;
    private String sigla;

    private EstadosBr(String sigla, String nome){
        this.sigla=sigla;
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla.toUpperCase();
    }
}
