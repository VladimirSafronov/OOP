public interface Chat {
    public void sendMessage(User user, String msg);

    public void append(User user);
}
