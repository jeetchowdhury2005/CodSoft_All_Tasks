import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Welcome to the Guess the Number Game!");

        boolean play = true;
        while (play) {

            int number = random.nextInt(100) + 1;
            int attempts = 5;
            boolean guessedCorrect = false;

            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have 5 tries to guess it.");
            System.out.println("Let's begin!");
            while (attempts > 0) {
                System.out.print("Enter your guess: "); 
                int guess = input.nextInt();

                if (guess == number) {         
                    System.out.println("Correct! You guessed it!");
                    guessedCorrect = true;
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

                attempts--;
                System.out.println("Tries left: " + attempts);
            }
            if (guessedCorrect) {
                System.out.println("You won! The number was: " + number);
            } else
            if (!guessedCorrect) {
                System.out.println("You're out of tries. The number was: " + number);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String answer = input.next();

            if (!answer.equalsIgnoreCase("yes")) {
                play = false;
            }
        }
        System.out.println("Game Over. You won " + score + " time(s).");
        System.out.println("Thanks for playing!");
        input.close();
    }
}

