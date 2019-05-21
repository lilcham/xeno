package patterns.singleton;

public class Singleton {

    //Constructor is private
    private Singleton() {}

    //Inner class creates the Singleton object when loaded
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //This is the public, static interface to get the object
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}