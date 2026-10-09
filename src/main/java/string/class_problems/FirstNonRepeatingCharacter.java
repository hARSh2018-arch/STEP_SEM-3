package string.class_problems;

import java.util.Scanner;

/**
 * Session 1 - Class Problem 4: First Non-Repeating Character
 *
 * Description:
 * Given a string, finds the first character that does not repeat anywhere in the string.
 * If all characters repeat, informs the user accordingly.
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(1) (fixed 256-size frequency array)
 */
public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeating(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        int[] freq = new int[256];

        // First pass: count occurrences
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 256) {
                freq[ch]++;
            }
        }

        // Second pass: find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 256 && freq[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== First Non-Repeating Character Finder ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("The entered string is empty.");
        } else {
            char result = findFirstNonRepeating(input);

            if (result != '\0') {
                int index = input.indexOf(result);
                System.out.println("The first non-repeating character in \"" + input + "\" is: '" + result + "' (at index " + index + ").");
            } else {
                System.out.println("No non-repeating character found in \"" + input + "\". All characters repeat.");
            }
        }

        scanner.close();
    }
}
