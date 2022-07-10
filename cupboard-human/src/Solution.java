public class Solution {
    public static void main(String[] args) {
        Cupboard cupboard1 = new Cupboard(Type.KITCHEN, false, false, 100);
        Cupboard cupboard2 = new Cupboard(Type.CLOTHING, true, true, 200);
        Cupboard cupboard3 = new Cupboard(Type.KITCHEN, true, false, 150);

        Owner owner = new Owner("Oleg");
        Worker worker = new Worker("Robot");
        Child child = new Child("Prokaznik");

        child.action(cupboard2);
        child.action(cupboard1);
        worker.action(cupboard1);
        worker.action(cupboard2);
        worker.action(cupboard3);
        owner.action(cupboard1);
        owner.action(cupboard2);
        owner.action(cupboard3);
        owner.addSubject(cupboard1, 50);
        owner.removeSubject(cupboard3, 100);
    }
}
