import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
public class RockPaperScissors {


    public static void startGame() {


        System.out.println("Lets play rock paper scissors!" +
                "\nIt's you against the computer." +
                "\nRemember the rules:" +
                "\n1. Scissors beat paper, paper beats rock, but rock beats scissors (simply destroys it)." +
                "\nThe game ends when one of payers gets 3 points.\nDo you want to play (y/n)?");

        Scanner s = new Scanner(System.in);
        String yn = s.nextLine();
        if (yn.equals("y")) {
            beginGame();
        } else if (yn.equals("n")) {
            System.out.println("Ok, you chicken.");
        } else {
            System.out.println("!!!!!! Wrong choice. Starting over.");
            startGame();
        }

    }

    public static void beginGame() {
        String[] options = {"p", "s", "r"};
        boolean gameOver = false;
        Scanner s = new Scanner(System.in);
        System.out.println("""
                p - Paper
                s - Scissors
                r - Rock""");
        int gameLimit = 3;
        String userChoice = "p";
        String computerChoice = null;
        int userScore = 0;
        int computerScore = 0;

        while (userScore < 3) {
            computerChoice = options[ThreadLocalRandom.current().nextInt(0, options.length)];
            System.out.println("Your move!");
            userChoice = s.nextLine();
            if (!(userChoice.equals("p") || userChoice.equals("s") || userChoice.equals("r"))) {
                System.out.println("Bad choice!");
            } else {
                System.out.println("You: " + userChoice + ", Computer: " + computerChoice);
            }

            if (userChoice.equals(computerChoice)) {
                System.out.println("Round draw!");
            }
            // User WINS

            else if (userChoice.equals("p") && computerChoice.equals("r")) {
                System.out.println("Your point");
                userScore += 1;
                text(userScore, computerScore);
            } else if (userChoice.equals("s") && computerChoice.equals("p")) {
                System.out.println("Your point!");
                userScore += 1;
                text(userScore, computerScore);
            } else if (userChoice.equals("r") && computerChoice.equals("s")) {
                System.out.println("Your point!");
                userScore += 1;
                text(userScore, computerScore);
            }

            // Computer WINS
            else if (userChoice.equals("p") && computerChoice.equals("s")) {
                System.out.println("Computer point");
                computerScore += 1;
                text(userScore, computerScore);
            } else if (userChoice.equals("s") && computerChoice.equals("r")) {
                System.out.println("Computer point!");
                computerScore += 1;
                text(userScore, computerScore);
            } else if (userChoice.equals("r") && computerChoice.equals("p")) {
                System.out.println("Computer point!");
                computerScore += 1;
                text(userScore, computerScore);
            }
        }
        results(userScore, computerScore);
    }
    public static void text(int uScore, int cScore) {
       System.out.println("Current score: User(" + uScore + "), Computer(" + cScore + ")");
    }

    public static void results(int userScore, int computerScore) {
        if (userScore > computerScore) {
            System.out.println("User WINS!");

        } else {
            System.out.println("Computer WINS!");
        }
    }
}






