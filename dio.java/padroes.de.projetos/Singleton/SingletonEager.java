/**
 * apressado
 */
public class SingletonEager {
    private static Singleton instancia;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
