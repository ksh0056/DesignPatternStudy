package pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Users implements Cloneable {
    private List<String> userList;

    public Users() {
        userList = new ArrayList();
    }

    public Users(List<String> list) {
        this.userList = list;
    }

    public void loadData() {
        userList.add("ssw");
        userList.add("bjh");
        userList.add("ysm");
        userList.add("hoj");
    }

    public List<String> getUserList() {
        return userList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList();
        for(String s : this.getUserList()) {
            temp.add(s);
        }
        return new Users(temp);
    }
}
