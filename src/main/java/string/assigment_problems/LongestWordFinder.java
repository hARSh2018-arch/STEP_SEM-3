package string.assigment_problems;

import java.util.Scanner;

/**
 * Session 1 - Assignment Problem 3: Longest Word Finder
 *
 * Description:
 * Reads a sentence and finds the longest word within it.
 * Strips out surrounding punctuation and reports both the word and its length.
 *
 * Example:
 * Input: "Java provides powerful object-oriented programming features."
 * Output: "programming" (11 characters)
 */
public class LongestWordFinder {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            // Strip non-alphanumeric punctuation from ends
            String cleaned = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
            if (cleaned.length() > longest.length()) {
                longest = cleaned;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Longest Word Finder ===");
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String longest = findLongestWord(input);

        if (longest.isEmpty()) {
            System.out.println("No valid words found.");
        } else {
            System.out.println("\nLongest Word: \"" + longest + "\"");
            System.out.println("Length:       " + longest.length() + " characters");
        }

        scanner.close();
    }
}
