
import java.util.Scanner;

public class CheckUsername {

    public static void main(String[] args) {

        //     username must be between 4-12 characters
        //     username must not contain spaces or underscores
        String username;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your new Username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters: ");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } else {
            System.out.println("Hello " + username);
        }

        scanner.close();
    }
}
