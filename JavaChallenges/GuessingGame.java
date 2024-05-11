package JavaChallenges;

import java.util.Scanner;

public class GuessingGame {
    int random;
    public GuessingGame() {
        // Generate a random number between 1 and 100
        this.random = (int) Math.ceil(Math.random() * 100);
    }
    /**
     * Checks if the guessed number matches the randomly generated number.
     *
     * @param guessNumber The number guessed by the player.
     * @return 0 if the guess is correct,
     * -1 if the guess is lower than the random number,
     * 1 if the guess is higher.
     */
    int guess(int guessNumber){
        if (guessNumber == random) {
            return 0; // Correct guess
        } else if (guessNumber < random) {
            return -1; // Guessed number is lower
        } else {
            return 1; // Guessed number is higher
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        int guess;
        int result;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        do {
            guess = sc.nextInt();
            result = game.guess(guess);

            if (result == -1) {
                System.out.println("Too low! Try again:");
            } else if (result == 1) {
                System.out.println("Too high! Try again:");
            }
        } while (result != 0);

        System.out.println("Congratulations! You guessed the number.");
        sc.close();

    }
}
