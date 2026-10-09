package classes_and_objects.assigment_problems;

/**
 * Session 2 - Assignment Problem: Assignment3
 * Topic: Classes and Objects - Bank Account State Simulator
 *
 * Description:
 * Structural template for modeling account balances, deposits, and withdrawals.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Assignment3 {

    private String itemName;
    private double itemValue;

    public Assignment3() {
        this.itemName = "Item";
        this.itemValue = 0.0;
    }

    public Assignment3(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public void display() {
        System.out.println("Assignment3 [Item: " + itemName + ", Value: " + itemValue + "]");
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2 Assignment: Bank Account State Simulator ===");
        Assignment3 obj = new Assignment3("SampleItem", 99.99);
        obj.display();
    }
}
