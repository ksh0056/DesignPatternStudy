package pattern.proxy;

public class Proxy implements IService {

    IService service;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달");

        service = new Service();
        return service.runSomething();
    }
}
