package javaBasico;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
    private int piscadas;
    public Pessoa (String cpf, String name){
        this.cpf=cpf;
        this.nome=name;
    }

    public void piscar(){
        confereOlho();
        fazerForca();
        piscando(piscadas);
        System.out.println("piscou");
    }
    private void piscando(int piscadas){
        this.piscadas++;
    }
    private void confereOlho(){
        System.out.println("olho seco!");
    }
    
    private void fazerForca(){
        System.out.println("piscando");
    }

    public int getPiscadas() {
        return piscadas;
    }

    public void setPiscadas(int piscadas) {
        this.piscadas = piscadas;
    }
}
