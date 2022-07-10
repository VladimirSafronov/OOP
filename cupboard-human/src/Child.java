public class Child implements Manipulation{
    private String name;

    public Child (String name) {
        this.name = name;
    }

    @Override
    public void action(Cupboard cupboard) {
        if (cupboard.getType().equals(Type.KITCHEN)) {
            System.out.println(this.name + " разбил посуду");
        }
        if (cupboard.getType().equals(Type.CLOTHING)) {
            System.out.println(this.name + " покатался на двери");
        }
    }
}
