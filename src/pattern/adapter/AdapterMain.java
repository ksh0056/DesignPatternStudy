package pattern.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        System.out.println(socketAdapter.get3Volt().getVolts());
    }
}
