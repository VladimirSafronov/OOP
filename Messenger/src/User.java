public class User {
    private String name;
    private Chat chat;

    public User(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void sendMsg (String text) {
        chat.sendMessage(this, text);
    }

    public void printMsg (String text) {
        System.out.printf("Чат %s: %s\n", getName(), text);
    }
}
