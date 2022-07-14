public class Child extends Human implements Manipulation{

    public Child (String name) {
        setName(name);
    }

    @Override
    public void action(Cupboard cupboard) {
        if (cupboard.getType().equals(Type.KITCHEN)) {
            System.out.println(getName() + " разбил посуду");
        }
        if (cupboard.getType().equals(Type.CLOTHING)) {
            System.out.println(getName() + " покатался на двери");
        }
    }
}
