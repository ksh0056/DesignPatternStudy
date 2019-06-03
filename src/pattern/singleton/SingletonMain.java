package pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        //EagerInitialization.getInstance().print();

        //StaticBlockInitialization.getInstance().print();

        //InitializationOnDemandHolderIdiom.getInstance();

        EnumInitialization.getInstance();
    }
}
