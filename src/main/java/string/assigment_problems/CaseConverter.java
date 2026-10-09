package string.assigment_problems;

import java.util.Scanner;

/**
 * Session 1 - Assignment Problem 5: Case Converter
 *
 * Description:
 * Converts a string into various naming conventions:
 * 1. Title Case ("hello world" -> "Hello World")
 * 2. camelCase ("hello world" -> "helloWorld")
 * 3. snake_case ("hello world" -> "hello_world")
 * 4. kebab-case ("hello world" -> "hello-world")
 */
public class CaseConverter {

    public static String toTitleCase(String text) {
        if (text == null || text.isEmpty()) return "";
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1).toLowerCase());
                if (i < words.length - 1) sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String toCamelCase(String text) {
        if (text == null || text.isEmpty()) return "";
        String[] words = text.trim().split("[\\s_\\-]+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                if (i == 0) {
                    sb.append(words[i].toLowerCase());
                } else {
                    sb.append(Character.toUpperCase(words[i].charAt(0)));
                    sb.append(words[i].substring(1).toLowerCase());
                }
            }
        }
        return sb.toString();
    }

    public static String toSnakeCase(String text) {
        if (text == null || text.isEmpty()) return "";
        return String.join("_", text.trim().toLowerCase().split("[\\s_\\-]+"));
    }

    public static String toKebabCase(String text) {
        if (text == null || text.isEmpty()) return "";
        return String.join("-", text.trim().toLowerCase().split("[\\s_\\-]+"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== String Case Converter ===");
        System.out.print("Enter phrase: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Converted Variations ---");
        System.out.println("Title Case: " + toTitleCase(input));
        System.out.println("camelCase:  " + toCamelCase(input));
        System.out.println("snake_case: " + toSnakeCase(input));
        System.out.println("kebab-case: " + toKebabCase(input));

        scanner.close();
    }
}
