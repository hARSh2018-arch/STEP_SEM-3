package classes_and_objects.class_problems;

/**
 * Session 2 - Class Problem: Problem4
 * Topic: Classes and Objects - Static Members and Utility Methods
 *
 * Description:
 * Demonstrates static variables, static methods, and class-level counter tracking.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Problem4 {

    private String name;
    private int id;

    public Problem4() {
        this.name = "Default";
        this.id = 1;
    }

    public Problem4(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Problem4 instance: ID=" + id + ", Name=" + name);
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2: Static Members and Utility Methods ===");
        Problem4 obj = new Problem4("Sample", 101);
        obj.display();
    }
}
