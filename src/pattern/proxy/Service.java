package pattern.proxy;

public class Service implements IService {
    @Override
    public String runSomething() {
        return "Service !";
    }
}
