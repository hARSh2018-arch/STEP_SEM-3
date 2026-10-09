package classes_and_objects.assigment_problems;

/**
 * Session 2 - Assignment Problem: Assignment1
 * Topic: Classes and Objects - Student Profile Management
 *
 * Description:
 * Structural template for managing student records using classes and objects.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Assignment1 {

    private String itemName;
    private double itemValue;

    public Assignment1() {
        this.itemName = "Item";
        this.itemValue = 0.0;
    }

    public Assignment1(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public void display() {
        System.out.println("Assignment1 [Item: " + itemName + ", Value: " + itemValue + "]");
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2 Assignment: Student Profile Management ===");
        Assignment1 obj = new Assignment1("SampleItem", 99.99);
        obj.display();
    }
}
