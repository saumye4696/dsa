package designpatterns;

/**
 * Eager Initialization
 */
public class SingletonEx {
    private static final SingletonEx singletonBean = new SingletonEx();

    // other classes cant create a new instance
    private SingletonEx() {
    }

    public static SingletonEx getInstance() {
        return singletonBean;
    }
}
