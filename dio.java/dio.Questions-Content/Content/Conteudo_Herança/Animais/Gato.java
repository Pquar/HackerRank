package Animais;

public class Gato extends Animal{
    //Atributos
    static int numeroGatos;


    //Contrustor adicionados
    Gato(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito){
        this.nome= nome;
        this.cor= cor;
        this.altura= altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;
        numeroGatos ++;
    }

    //metodos
    public void comer(){
    }

    public int getnumeroGatos(){
        return numeroGatos;
    }

    public void setnumeroGatos(int numeroGatos){
        this.numeroGatos= numeroGatos;
    }

}
