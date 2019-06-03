package pattern.singleton;

public class EagerInitialization {
    private static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {
        System.out.println("Call EagerInitialization constructor");
    }

    public static EagerInitialization getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("It's print() method in EagerInitialization instance.");
        System.out.println("instance hashcode > " + instance.hashCode());
    }
}
