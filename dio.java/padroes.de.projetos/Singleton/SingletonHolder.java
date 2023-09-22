public class SingletonHolder {
    //treadh safe
    private static class InstanceHolder{
        public static SingletonHolder instancia = new SingletonHolder();
    }
    private SingletonHolder(){
        super();
    }
    public static SingletonHolder getInstance() {
        return InstanceHolder.instancia;
    }
}