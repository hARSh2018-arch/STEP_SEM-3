package classes_and_objects.class_problems;

/**
 * Session 2 - Class Problem: Problem5
 * Topic: Classes and Objects - Object State and Getter/Setter Methods
 *
 * Description:
 * Demonstrates maintaining state and providing accessors and mutators.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Problem5 {

    private String name;
    private int id;

    public Problem5() {
        this.name = "Default";
        this.id = 1;
    }

    public Problem5(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Problem5 instance: ID=" + id + ", Name=" + name);
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2: Object State and Getter/Setter Methods ===");
        Problem5 obj = new Problem5("Sample", 101);
        obj.display();
    }
}
