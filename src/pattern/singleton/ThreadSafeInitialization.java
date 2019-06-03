package pattern.singleton;

public class ThreadSafeInitialization {

    private static ThreadSafeInitialization instance;
    private  ThreadSafeInitialization() {}

    public static synchronized ThreadSafeInitialization getInstance() {
        if(instance == null)
            instance = new ThreadSafeInitialization();
        return instance;
    }

    public void print () {
        System.out.println("It's print() method in ThreadSafeInitalization instance.");
        System.out.println("instance hashCode > " + instance.hashCode());
    }
}
