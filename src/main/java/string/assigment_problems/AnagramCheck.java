package string.assigment_problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Session 1 - Assignment Problem 1: Anagram Check
 *
 * Description:
 * Checks whether two input strings are anagrams of each other.
 * Two strings are anagrams if they contain the same characters in the same frequency,
 * ignoring cases and spaces.
 *
 * Example:
 * "listen" and "silent" -> true
 * "triangle" and "integral" -> true
 */
public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        // Clean strings: remove whitespace and convert to lowercase
        String clean1 = s1.replaceAll("\\s+", "").toLowerCase();
        String clean2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (clean1.length() != clean2.length()) {
            return false;
        }

        char[] arr1 = clean1.toCharArray();
        char[] arr2 = clean2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Anagram Checker ===");
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        boolean result = isAnagram(s1, s2);
        System.out.println("\nResult: \"" + s1 + "\" and \"" + s2 + "\" are " +
                (result ? "ANAGRAMS" : "NOT ANAGRAMS") + ".");

        scanner.close();
    }
}
