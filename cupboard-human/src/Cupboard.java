public class Cupboard {
    private int id;
    private String type; //кухонный, вещевой
    private boolean hasMirror; //имеется ли зеркало
    private boolean hasLeg; //имеются ли ножки
    private String color;

    public Cupboard(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setHasMirror(boolean hasMirror) {
        this.hasMirror = hasMirror;
    }

    public boolean getHasMirror() {
        return this.hasMirror;
    }

    public void setHasLeg(boolean hasLeg) {
        this.hasLeg = hasLeg;
    }

    public boolean getHasLeg() {
        return this.hasLeg;
    }
}
