package Animais;

public class Animal {
    //Atributos
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;


    //metodos
    protected String getNome(){
        return nome;
    }

    protected void setNome(String nome){
        this.nome= nome;
    }

}
