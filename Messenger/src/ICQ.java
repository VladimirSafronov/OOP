import java.util.ArrayList;
import java.util.List;

public class ICQ implements Chat {
    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(User me, String msg) {
        for (User user : users) {
            if (!(user.getName().equals(me.getName()))) {
                user.printMsg(msg);
            }
        }
    }

    @Override
    public void append(User user) {
        users.add(user);
        System.out.println(">>> " + user.getName() + " присоединился к чату <<<");
    }
}
