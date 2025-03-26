import java.util.Scanner;

/**
 *  Partner Lab 3: To develop two Games as described below.
 *  Description: This class is meant for main menu to execute two games developed
 *  1. Guess a Number
 *  2. Rock paper Scissor
 *  @author Aagna Modi
 *  @author Suman Sharma
 *  @since 03/25/2025
 */
public class AssignmentDriver {
    public static void main(String[] args) {
        System.out.println("You can play either of below games:\n 1. Guess A Number\n2. Rock Paper Scissor");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("----- You have chosen to play Guess A Number -----");
                GuessGame guessGame = new GuessGame();
                guessGame.play(100);
                break;
            case 2:
                System.out.println("----- You have chosen to play Rock Paper Scissor -----");
                RockPaperScissor rockPaperScissorGame = new RockPaperScissor();
                rockPaperScissorGame.play();
                break;

        }

    }
}
