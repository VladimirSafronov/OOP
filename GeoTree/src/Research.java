import java.util.ArrayList;
import java.util.List;

public class Research {
    private List<Node> tree;

    public Research(GeoTree gt) {
        tree = gt.getTree();
    }

    public List<Person> doResearch(Person person, Relationship relationship) {
        List<Person> result = new ArrayList<>();

        for(Node t : tree) {
            if(t.getFirstPerson().getName().equals(person.getName())
            && t.relationship == relationship) {
                result.add(t.getSecondtPerson());
            }
        }
        return result;
    }
}
