public class Cupboard {
    private String type; //кухонный, вещевой
    private boolean hasMirror; //имеется ли зеркало
    private boolean hasLeg; //имеются ли ножки
    private String color;

    public Cupboard(String type, String color, boolean hasMirror, boolean hasLeg) {
        this.type = type;
        this.color = color;
        this.hasMirror = hasMirror;
        this.hasLeg = hasLeg;
    }
}
