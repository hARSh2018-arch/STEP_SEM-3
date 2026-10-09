package classes_and_objects.class_problems;

/**
 * Session 2 - Class Problem: Problem3
 * Topic: Classes and Objects - Method Overloading in Classes
 *
 * Description:
 * Demonstrates method overloading with different parameters and return types.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Problem3 {

    private String name;
    private int id;

    public Problem3() {
        this.name = "Default";
        this.id = 1;
    }

    public Problem3(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Problem3 instance: ID=" + id + ", Name=" + name);
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2: Method Overloading in Classes ===");
        Problem3 obj = new Problem3("Sample", 101);
        obj.display();
    }
}
