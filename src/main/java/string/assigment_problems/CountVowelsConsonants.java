package string.assigment_problems;

import java.util.Scanner;

/**
 * Session 1 - Assignment Problem 2: Count Vowels and Consonants
 *
 * Description:
 * Analyzes an input string and counts:
 * - Vowels (A, E, I, O, U)
 * - Consonants (alphabetic letters that are not vowels)
 * - Digits (0-9)
 * - Special characters / whitespace
 */
public class CountVowelsConsonants {

    public static void countCharacters(String str) {
        if (str == null) return;

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Vowels:             " + vowels);
        System.out.println("Consonants:         " + consonants);
        System.out.println("Digits:             " + digits);
        System.out.println("Special Characters: " + special);
        System.out.println("Total Characters:   " + str.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Character Classifier & Counter ===");
        System.out.print("Enter text to analyze: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Analysis Report ---");
        countCharacters(input);

        scanner.close();
    }
}
