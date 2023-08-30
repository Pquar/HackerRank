package Animais;

public class Cao extends Animal{
    //Atributos
    static int numeroCachorros;

    private int tamanhoRabo;

    //Contrustor adicionados
    Cao(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito){
        this.nome= nome;
        this.cor= cor;
        this.altura= altura;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoEspirito = estadoEspirito;
        numeroCachorros ++;
    }





    //metodos

    public int getnumeroCachorros(){
        return numeroCachorros;
    }

    public void setnumeroCachorros(int numeroCachorros){
        this.numeroCachorros= numeroCachorros;
    }
}
