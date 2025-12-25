import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("🎯 Welcome to Number Guessing Game!");

        while (playAgain) {

            int numberToGuess = random.nextInt(100) + 1; // 1 to 100
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts.");

            while (attemptsLeft > 0) {

                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed the number.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } 
                else if (userGuess > numberToGuess) {
                    System.out.println("🔼 Too High!");
                } 
                else {
                    System.out.println("🔽 Too Low!");
                }

                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("❌ You lost! The number was: " + numberToGuess);
            }

            System.out.println("🏆 Current Score: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing!");
        System.out.println("Final Score: " + score);
        scanner.close();
    }
}
