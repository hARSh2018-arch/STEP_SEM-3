package string.class_problems;

import java.util.Scanner;

/**
 * Session 1 - Class Problem 3: BMI Calculator for a Team
 *
 * Description:
 * Calculates Body Mass Index (BMI) for multiple members of a team, classifies
 * each person into health categories, and calculates the average team BMI.
 *
 * Formula:
 * BMI = weight (in kg) / (height (in meters) * height (in meters))
 *
 * Categories:
 * - Underweight: < 18.5
 * - Normal: 18.5 - 24.9
 * - Overweight: 25.0 - 29.9
 * - Obese: >= 30.0
 */
public class TeamBMICalculator {

    public static double calculateBMI(double weightKg, double heightMeters) {
        return weightKg / (heightMeters * heightMeters);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Team BMI Calculator ===");
        System.out.print("Enter number of team members: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Team size must be an integer.");
            scanner.close();
            return;
        }
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Team size must be at least 1.");
            scanner.close();
            return;
        }

        String[] names = new String[count];
        double[] heights = new double[count];
        double[] weights = new double[count];
        double[] bmis = new double[count];
        double totalBMI = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Member " + (i + 1) + " ---");
            System.out.print("Enter Name: ");
            names[i] = scanner.next();

            System.out.print("Enter Height (in meters, e.g. 1.75): ");
            heights[i] = scanner.nextDouble();
            while (heights[i] <= 0 || heights[i] > 3.0) {
                System.out.print("Invalid height! Enter realistic height in meters (>0 and <3): ");
                heights[i] = scanner.nextDouble();
            }

            System.out.print("Enter Weight (in kg, e.g. 70): ");
            weights[i] = scanner.nextDouble();
            while (weights[i] <= 0 || weights[i] > 500) {
                System.out.print("Invalid weight! Enter realistic weight in kg (>0): ");
                weights[i] = scanner.nextDouble();
            }

            bmis[i] = calculateBMI(weights[i], heights[i]);
            totalBMI += bmis[i];
        }

        System.out.println("\n================= TEAM BMI REPORT =================");
        System.out.printf("%-15s %-12s %-12s %-10s %-15s%n", "Name", "Height (m)", "Weight (kg)", "BMI", "Category");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s %-12.2f %-12.2f %-10.2f %-15s%n",
                    names[i], heights[i], weights[i], bmis[i], getBMICategory(bmis[i]));
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Team Average BMI: %.2f (%s)%n", (totalBMI / count), getBMICategory(totalBMI / count));

        scanner.close();
    }
}
