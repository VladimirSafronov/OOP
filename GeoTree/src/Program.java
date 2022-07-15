public class Program {
    public static void main(String[] args) {
        Person grandmother = new Person("Svetlana");
        Person daughter = new Person("Alena");
        Person grandson = new Person("Stepan");
        Person granddaughter = new Person("Ira");

        GeoTree gt = new GeoTree();
        gt.addPair(grandmother, daughter);
        gt.addPair(daughter, grandson);
        gt.addPair(daughter, granddaughter);

        System.out.println(new Research(gt).doResearch(daughter, Relationship.children));
    }
}
