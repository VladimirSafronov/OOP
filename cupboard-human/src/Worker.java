public class Worker implements Manipulation {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void action(Cupboard cupboard) {
        if (cupboard.getHasLeg() && cupboard.getHasMirror()) {
            System.out.println(this.name + " вымыл под шкафом, и протер зеркало");
        } else if (cupboard.getHasLeg() && !cupboard.getHasMirror()) {
            System.out.println(this.name + " вымыл под шкафом");
        } else if (!cupboard.getHasLeg() && cupboard.getHasMirror()) {
            System.out.println(this.name + " протер зеркало");
        } else
            System.out.println("Все чисто");
    }

}
