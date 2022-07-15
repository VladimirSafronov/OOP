import java.util.ArrayList;
import java.util.List;

public class GeoTree {
    private List<Node> tree = new ArrayList<>();

    public List<Node> getTree() {
        return tree;
    }

    public void addPair(Person parent, Person child) {
        tree.add(new Node(parent, Relationship.children, child));
        tree.add(new Node(child, Relationship.parent, parent));
    }
}
