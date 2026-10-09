package classes_and_objects.assigment_problems;

/**
 * Session 2 - Assignment Problem: Assignment4
 * Topic: Classes and Objects - Book Library Catalog Entry
 *
 * Description:
 * Structural template for modeling library catalog items.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Assignment4 {

    private String itemName;
    private double itemValue;

    public Assignment4() {
        this.itemName = "Item";
        this.itemValue = 0.0;
    }

    public Assignment4(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public void display() {
        System.out.println("Assignment4 [Item: " + itemName + ", Value: " + itemValue + "]");
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2 Assignment: Book Library Catalog Entry ===");
        Assignment4 obj = new Assignment4("SampleItem", 99.99);
        obj.display();
    }
}
