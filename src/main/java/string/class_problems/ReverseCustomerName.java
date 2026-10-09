package string.class_problems;

import java.util.Scanner;

/**
 * Session 1 - Class Problem 5: Reverse Customer Name
 *
 * Description:
 * Reverses a customer's full name using different techniques:
 * 1. Character-by-character reversal (using in-place char array two-pointer technique)
 * 2. StringBuilder approach
 * 3. Word-by-word reversal (preserving word internal spelling but reversing word order)
 */
public class ReverseCustomerName {

    /**
     * Approach 1: In-place two-pointer character array reversal
     */
    public static String reverseCharactersTwoPointer(String name) {
        if (name == null) return null;
        char[] chars = name.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    /**
     * Approach 2: Using StringBuilder
     */
    public static String reverseCharactersStringBuilder(String name) {
        if (name == null) return null;
        return new StringBuilder(name).reverse().toString();
    }

    /**
     * Approach 3: Word-by-word reversal (e.g. "Alice Johnson" -> "Johnson Alice")
     */
    public static String reverseWords(String name) {
        if (name == null) return null;
        String[] words = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Reverse Customer Name ===");
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Customer name cannot be empty.");
        } else {
            System.out.println("\n--- Name Reversal Results ---");
            System.out.println("Original Name:                          " + name);
            System.out.println("Character Reversal (Two-Pointer):       " + reverseCharactersTwoPointer(name));
            System.out.println("Character Reversal (StringBuilder):     " + reverseCharactersStringBuilder(name));
            System.out.println("Word-by-Word Reversal:                  " + reverseWords(name));
        }

        scanner.close();
    }
}
