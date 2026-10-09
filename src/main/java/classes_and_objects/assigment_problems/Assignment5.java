package classes_and_objects.assigment_problems;

/**
 * Session 2 - Assignment Problem: Assignment5
 * Topic: Classes and Objects - Employee Payroll Record
 *
 * Description:
 * Structural template for modeling employee wage and department information.
 * Note: Official question statement pending release by BridgeLabz CodInClub.
 */
public class Assignment5 {

    private String itemName;
    private double itemValue;

    public Assignment5() {
        this.itemName = "Item";
        this.itemValue = 0.0;
    }

    public Assignment5(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public void display() {
        System.out.println("Assignment5 [Item: " + itemName + ", Value: " + itemValue + "]");
    }

    public static void main(String[] args) {
        System.out.println("=== Session 2 Assignment: Employee Payroll Record ===");
        Assignment5 obj = new Assignment5("SampleItem", 99.99);
        obj.display();
    }
}
