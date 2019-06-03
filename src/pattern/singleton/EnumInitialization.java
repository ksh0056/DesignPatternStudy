package pattern.singleton;

public enum EnumInitialization {
    INSTANCE;
    static String test = "";
    public static EnumInitialization getInstance() {
        test = "test";
        return INSTANCE;
    }
}
