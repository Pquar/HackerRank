package javaBasico;

public class Padeiro extends PessoaAbs {

    private int paoFrances;

    //construtor - So e necessario pois a classe pessoa tem um contrutor

    @Override
   public void comer() {
        System.out.println("fome");
    }

    @Override
    public void dormir() {
        System.out.println("sono");
    }


    public void pao(){
        this.paoFrances++;
        System.out.println("fazendo pao: "+ paoFrances);
    }

}
