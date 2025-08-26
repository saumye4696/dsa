package designpatterns;

public class StaticBlockSingleton {
    private StaticBlockSingleton() {}

    private static StaticBlockSingleton instance ;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println("exception while creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
