public class CepApi{

    private static CepApi instance = new CepApi();
    public CepApi(){
        super();
    }
    public static CepApi getInstance(){
        return instance;
    }
    public String recuperarCidade(String cep){
        return "az"
    }
}