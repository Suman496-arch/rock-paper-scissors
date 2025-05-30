import java.util.Random;
import java.util.Scanner;

/**
 *  Partner Lab 3: Guess a Number
 *  Description: The program thinks of a number and the user has to guess that number in max 5 attempts.
 *               If the user guesses it correct, he/she would win else would lose.
 *  @author Aagna Modi
 *  @since 03/25/2025
 */
public class GuessGame {
    /**
     * To play the game of "Guess number"
     *
     * @param n max number so that program would guess any random number in the range of 1 to 'n'
     */
    public void play(int n) {
        int retryCount = 5;
        System.out.println("I am thinking of a number between 1 and " + n);
        System.out.println("Guess what it is. You have " + retryCount + " retries.");
        Scanner scanner = new Scanner(System.in);

        String choice = "Y";
        while (true) {
            choice = choice.toLowerCase();
            switch (choice) {
                case "y":
                    Random random = new Random();
                    int thoughtNumber = random.nextInt(n);

                    int attempt = retryCount;
                    while (attempt > 0) {
                        System.out.println("Guess a Number:  ");
                        int guessedNumber = scanner.nextInt();
                        if (thoughtNumber == guessedNumber) {
                            System.out.println("You won as you guessed it correct. I had also thought of " + thoughtNumber);
                            break;
                        }

                        if (guessedNumber > thoughtNumber) {
                            System.out.println("You guessed a higher number.");
                        } else {
                            System.out.println("You guessed a lower number");
                        }

                        attempt--;
                    }

                    if (attempt <= 0){
                        System.out.println("Your limit is over. You loose");
                    }
                    break;
                case "n" :
                    System.out.println("Thanks for playing. Have a good day ahead :)");
                    return;
                default:
                    System.out.println("Invalid option chosen..!");
            }

            System.out.println("\n\nDo you want to play (Y/N)?\n");
            choice = scanner.next();
        }

    }
}
