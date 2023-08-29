package desafio;

public class Iphone extends Io10 implements Ipod, Telefone, Safari {
    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void pausar() {
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusicar() {
        System.out.println("selecionar Musica");
    }

    @Override
    public void ligar() {
        System.out.println("ligar para Telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atender Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibirPagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizarPagina");
    }

    public static void main(String[] args) {
        Io10 ios10 = new Io10();
        Iphone iphone = new Iphone();

        System.out.println(ios10.getVersion());
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusicar();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
