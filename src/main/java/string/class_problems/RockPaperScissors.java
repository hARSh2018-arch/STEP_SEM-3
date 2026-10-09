package string.class_problems;

import java.util.Random;
import java.util.Scanner;

/**
 * Session 1 - Class Problem 1: Rock-Paper-Scissors Game
 *
 * Description:
 * A console-based game where a user plays Rock-Paper-Scissors against the computer.
 *
 * Rules:
 * - Rock beats Scissors
 * - Scissors beats Paper
 * - Paper beats Rock
 * - Identical choices result in a tie
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("=== Rock-Paper-Scissors Game ===");
        System.out.print("Enter your choice (rock, paper, scissors) or 'exit' to quit: ");

        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Input validation
            if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
                System.out.print("Invalid choice! Please enter 'rock', 'paper', 'scissors', or 'exit': ");
                continue;
            }

            // Computer randomly selects choice
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer chose: " + computerChoice);

            // Determine winner
            if (userInput.equals(computerChoice)) {
                System.out.println("Result: It's a tie!");
            } else if ((userInput.equals("rock") && computerChoice.equals("scissors")) ||
                       (userInput.equals("scissors") && computerChoice.equals("paper")) ||
                       (userInput.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("Result: You win! " + userInput + " beats " + computerChoice + ".");
            } else {
                System.out.println("Result: Computer wins! " + computerChoice + " beats " + userInput + ".");
            }

            System.out.println();
            System.out.print("Play again? Enter choice (rock, paper, scissors) or 'exit': ");
        }

        scanner.close();
    }
}
