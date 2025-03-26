import java.util.Scanner;

public class AssignmentDriver {
    public static void main(String[] args) {
        System.out.println("You can play either of below games:\n 1. Guess A Number\n2. Rock Paper Scissor");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("----- You have chosen to play Guess A Number -----");
                GuessGamebackup guessGame = new GuessGamebackup();
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
