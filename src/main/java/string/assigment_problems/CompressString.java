package string.assigment_problems;

import java.util.Scanner;

/**
 * Session 1 - Assignment Problem 4: Basic String Compression
 *
 * Description:
 * Implements a method to perform basic string compression using the counts
 * of repeated characters (Run-Length Encoding).
 *
 * Example:
 * Input:  "aabcccccaaa"
 * Output: "a2b1c5a3"
 *
 * If the "compressed" string would not become smaller than the original string,
 * the method returns the original string.
 */
public class CompressString {

    public static String compress(String str) {
        if (str == null || str.length() <= 2) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // If next character is different or we reached the end
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        String result = compressed.toString();
        // Return original if compressed is not strictly shorter
        return result.length() < str.length() ? result : str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Run-Length String Compression ===");
        System.out.print("Enter string to compress: ");
        String input = scanner.nextLine().trim();

        String output = compress(input);

        System.out.println("\nOriginal:   " + input + " (length: " + input.length() + ")");
        System.out.println("Compressed: " + output + " (length: " + output.length() + ")");

        scanner.close();
    }
}
