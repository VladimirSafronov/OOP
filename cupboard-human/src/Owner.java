public class Owner implements Manipulation {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println("Взял посуду");
    }
}
