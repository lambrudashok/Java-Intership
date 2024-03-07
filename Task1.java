
import java.util.*;
class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerNo = 1;
        int higherNo = 100;
        int numberOfAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.printf("%c%c Welcome to the Number Guessing Game! %c%c\n",3,2,2,3);
        System.out.println("=======================================================");

        do {
            int targetNo = random.nextInt(higherNo - lowerNo + 1) + lowerNo;
            System.out.println("\nRound " + (rounds + 1) + " - Guess the number between " + lowerNo + " and " + higherNo);

            for (int attempts = 1; attempts <= numberOfAttempts; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess == targetNo) {
                    System.out.printf("%c%c Congratulations! Guessed number is correct.",2,2);
                    score = score+ numberOfAttempts - (attempts - 1);  
                    break;
                } else if (userGuess < targetNo) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts == numberOfAttempts) {
                    System.out.println("Sorry, all attempts are incorrect. The correct number was: " + targetNo);
                }
            }

            System.out.print("Do you want to play again? (1.yes/0.no): ");
            int playAgain = sc.nextInt();

            if (playAgain==1) {
                rounds++;
            } else if (playAgain==0) {
                break;
            } else {
                System.out.println("Invalid input. Exiting the game.");
                break;
            }
        } while (true);

        System.out.println("=================================================");
        System.out.println("Game over! Your total score: " + score);
        sc.close();
    }
}
