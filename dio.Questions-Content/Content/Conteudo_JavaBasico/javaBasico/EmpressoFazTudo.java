package javaBasico;

public class EmpressoFazTudo implements Copiadora, Digitalizar{
    @Override
    public void digitaliza() {
        System.out.println("faz tudo, digitaliza");
    }

    @Override
    public void copia() {
        System.out.println("faz tudo, copia");
    }
}
