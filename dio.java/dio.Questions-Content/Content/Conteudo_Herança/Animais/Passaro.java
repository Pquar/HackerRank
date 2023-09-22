package Animais;

public class Passaro extends Animal{
    //Atributos
    static int numeroPassaro;


    //Contrustor adicionados
    Passaro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito){
        this.nome= nome;
        this.cor= cor;
        this.altura= altura;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoEspirito = estadoEspirito;
        numeroPassaro ++;
    }

    //metodos
    public void comer(){
    }

    public int getnumeroPassaro(){
        return numeroPassaro;
    }

    public void setnumeroCachorros(int numeroPassaro){
        this.numeroPassaro= numeroPassaro;
    }

}
