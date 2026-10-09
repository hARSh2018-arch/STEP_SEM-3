package classes_and_objects.assigment_problems;

/**
 * Session 2 - Assignment Problem: Assignment2
 * Topic: Classes and Objects - Inventory Product Tracker
 *
 * Description:
 * Structural template for tracking product stock and pricing.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Assignment2 {

    private String itemName;
    private double itemValue;

    public Assignment2() {
        this.itemName = "Item";
        this.itemValue = 0.0;
    }

    public Assignment2(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public void display() {
        System.out.println("Assignment2 [Item: " + itemName + ", Value: " + itemValue + "]");
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2 Assignment: Inventory Product Tracker ===");
        Assignment2 obj = new Assignment2("SampleItem", 99.99);
        obj.display();
    }
}
