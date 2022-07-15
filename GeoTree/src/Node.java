public class Node {
    private Person firstPerson;
    Relationship relationship;
    private Person secondPerson;

    public Node(Person firstPerson, Relationship relationship, Person secondPerson) {
        this.firstPerson = firstPerson;
        this.relationship = relationship;
        this.secondPerson = secondPerson;
    }

    public Person getFirstPerson() {
        return firstPerson;
    }

    public Person getSecondtPerson() {
        return secondPerson;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", firstPerson.getName(), relationship, secondPerson.getName());
    }
}
