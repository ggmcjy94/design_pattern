package creational_pattern.singleton_pattern._01_eager_initialization;

public class Singleton {

    private static final Singleton instance = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}
