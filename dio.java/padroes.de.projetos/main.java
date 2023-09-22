public class main {
    public static void main(String[] args) {

        //singletom
        Singleton lazy = Singleton.getInstancia();
        System.out.println(lazy);
        lazy = Singleton.getInstancia();
        System.out.println(lazy);

        //strategy
        Comportamento atk = new Comportamento();
        Comportamento def = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(def);
        robo.mover();
        robo.setComportamento(atk);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("abc", "123")
    }
}