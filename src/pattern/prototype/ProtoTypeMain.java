package pattern.prototype;

public class ProtoTypeMain {
    public static void main(String[] args) throws Exception {
        Users originusers = new Users();
        originusers.loadData();

        Users cloneUsers = (Users)originusers.clone();

        System.out.println(cloneUsers.getUserList());
    }
}
