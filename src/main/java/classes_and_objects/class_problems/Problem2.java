package classes_and_objects.class_problems;

/**
 * Session 2 - Class Problem: Problem2
 * Topic: Classes and Objects - Parameterized Constructors and this Keyword
 *
 * Description:
 * Demonstrates parameterized constructor initialization and use of the this reference.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Problem2 {

    private String name;
    private int id;

    public Problem2() {
        this.name = "Default";
        this.id = 1;
    }

    public Problem2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Problem2 instance: ID=" + id + ", Name=" + name);
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2: Parameterized Constructors and this Keyword ===");
        Problem2 obj = new Problem2("Sample", 101);
        obj.display();
    }
}
