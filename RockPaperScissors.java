
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        //     Rock Paper Scissors Game

        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        String playAgain = "yes";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.print("Enter your choice (rock, paper or scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper or scissors.");
                continue;
            }

            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println(computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (userChoice.equals("paper") && computerChoice.equals("rock"))
                    || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (yes or no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Good bye!");

        scanner.close();
    }
}
