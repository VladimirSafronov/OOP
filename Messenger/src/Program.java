public class Program {
    public static void main(String[] args) {
        ICQ icq = new ICQ();
        User user1 = new User("Masha", icq);
        icq.append(user1);
        User user3 = new User("Vania", icq);
        icq.append(user3);
        user1.sendMsg("Hello!");
        User user4 = new User("Lesha", icq);
        icq.append(user4);
        user4.sendMsg("абырвалг");
    }
}
