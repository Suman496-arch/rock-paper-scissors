import java.util.Random;
import java.util.Scanner;

/**
 *  Partner Lab 3: Rock Paper Scissor Game
 *  Description: User has to enter his/her move using given option and the program would decide who won, or it was a tie
 *  @author Suman Sharma
 *  @since 03/25/2025
 */
public class RockPaperScissor {
    /**
     * To play the game of "Guess number"
     *
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int RandomNumber=random.nextInt(3);


        while (true) {
            System.out.println("Welcome to the rock, paper, Scissors game ");
            System.out.println("Enter your move: 0 = Rock");
            System.out.println("1 = Paper");
            System.out.println(" 2 = Scissors.");
            System.out.println("Type 3 to exit:");
            int userChoice = scanner.nextInt();

            if (userChoice == 3) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            System.out.println("Computer chose: " + RandomNumber);

            int result = (3 + userChoice - computerChoice) % 3;
            switch (result) {
                case 0:
                    System.out.println("It's a tie!");
                    break;
                case 1:
                    System.out.println("You win!");
                    break;
                case 2:
                    System.out.println("You lose!");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}
