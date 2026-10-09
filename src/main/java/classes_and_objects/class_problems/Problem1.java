package classes_and_objects.class_problems;

/**
 * Session 2 - Class Problem: Problem1
 * Topic: Classes and Objects - Basic Class and Object Creation
 *
 * Description:
 * Demonstrates defining a simple class with attributes and methods, then creating instances.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Problem1 {

    private String name;
    private int id;

    public Problem1() {
        this.name = "Default";
        this.id = 1;
    }

    public Problem1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Problem1 instance: ID=" + id + ", Name=" + name);
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2: Basic Class and Object Creation ===");
        Problem1 obj = new Problem1("Sample", 101);
        obj.display();
    }
}
