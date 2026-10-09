package string.class_problems;

import java.util.Scanner;

/**
 * Session 1 - Class Problem 2: Palindrome Checker
 *
 * Description:
 * Checks whether a given string is a palindrome using three different approaches:
 * 1. Iterative two-pointer approach
 * 2. Recursive approach
 * 3. Array reversal approach
 */
public class PalindromeChecker {

    /**
     * Approach 1: Iterative two-pointer approach
     * Time Complexity: O(n), Space Complexity: O(1)
     */
    public static boolean isPalindromeIterative(String str) {
        if (str == null) return false;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Approach 2: Recursive approach
     * Time Complexity: O(n), Space Complexity: O(n) call stack
     */
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (str == null) return false;
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    /**
     * Approach 3: Array reversal approach
     * Time Complexity: O(n), Space Complexity: O(n)
     */
    public static boolean isPalindromeArrayReversal(String str) {
        if (str == null) return false;
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (3 Approaches) ===");
        System.out.print("Enter a string to test: ");
        String input = scanner.nextLine().trim();

        String cleaned = input.toLowerCase();

        boolean resultIterative = isPalindromeIterative(cleaned);
        boolean resultRecursive = isPalindromeRecursive(cleaned, 0, cleaned.length() - 1);
        boolean resultArray = isPalindromeArrayReversal(cleaned);

        System.out.println("\nResults for \"" + input + "\":");
        System.out.println("1. Iterative Approach:      " + (resultIterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("2. Recursive Approach:      " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("3. Array Reversal Approach: " + (resultArray ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
