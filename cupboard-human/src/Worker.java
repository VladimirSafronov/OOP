public class Worker extends Human implements Manipulation {

    public Worker(String name) {
        setName(name);
    }

    @Override
    public void action(Cupboard cupboard) {
        if (cupboard.getHasLeg() && cupboard.getHasMirror()) {
            System.out.println(getName() + " вымыл под шкафом, и протер зеркало");
        } else if (cupboard.getHasLeg() && !cupboard.getHasMirror()) {
            System.out.println(getName() + " вымыл под шкафом");
        } else if (!cupboard.getHasLeg() && cupboard.getHasMirror()) {
            System.out.println(getName() + " протер зеркало");
        } else
            System.out.println("Все чисто");
    }

}
