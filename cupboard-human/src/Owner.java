public class Owner extends Human implements Manipulation {

    public Owner(String name) {
        setName(name);
    }

    @Override
    public void action(Cupboard cupboard) {
        if (cupboard.getType().equals(Type.KITCHEN)) {
            System.out.println(getName() + " взял посуду");
        }
        if (cupboard.getType().equals(Type.CLOTHING)) {
            System.out.println(getName() + " взял вещь");
        }
    }

    //достаточно примитивная реализация взятия и добавление предметов. Решил не углубляться.
    public void addSubject(Cupboard cupboard, int v) {
        if (cupboard.getVolume() - v < 0) {
            System.out.println("Шкаф переполнен");
        } else {
            cupboard.setVolume(cupboard.getVolume() - v);
            System.out.printf("Положил вещь объемом %d\n", v);
        }
    }

    public void removeSubject(Cupboard cupboard, int v) {
        if (cupboard.getVolume() == cupboard.getMaxVolume()) {
            System.out.println("Шкаф пуст");
        } else {
            cupboard.setVolume(cupboard.getVolume() + v);
            System.out.printf("Взял вещь объемом %d\n", v);
        }
    }
}
