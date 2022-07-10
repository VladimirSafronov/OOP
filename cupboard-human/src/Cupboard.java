public class Cupboard {
    private int id;
    private int maxVolume; //объем шкафа
    private int volume; //оставшийся объем шкафа
    private static int count; //общее количество шкафов
    private Type type; //кухонный, вещевой
    private boolean hasMirror; //имеется ли зеркало
    private boolean hasLeg; //имеются ли ножки

    public Cupboard(Type type, boolean hasMirror, boolean hasLeg, int maxVolume) {
        this.id = ++count;
        this.type = type;
        this.hasMirror = hasMirror;
        this.hasLeg = hasLeg;
        this.maxVolume = maxVolume;
        this.volume = maxVolume;
    }

    public int getId() {
        return this.id;
    }

    public boolean getHasMirror() {
        return this.hasMirror;
    }

    public boolean getHasLeg() {
        return this.hasLeg;
    }

    public Type getType() {
        return this.type;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }
}
