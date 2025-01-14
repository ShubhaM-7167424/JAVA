
import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        double balance = 0;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawl");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.printf("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            System.out.println("*****************");

            switch (choice) {
                case 1 ->
                    showBalance(balance);
                case 2 ->
                    balance += Deposit();
                case 3 ->
                    balance -= Withdrawl(balance);
                case 4 ->
                    isRunning = false;
                default ->
                    System.out.println("INVALID CHOICE: ");

            }
        }

        System.out.println("*****************");
        System.out.println("Thank You! Have a nice Day.");
        System.out.println("*****************");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    static double Deposit() {
        double amount;
        System.out.printf("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative: ");
            return 0;
        } else {
            return amount;
        }
    }

    static double Withdrawl(double balance) {
        double amount;
        System.out.printf("Enter amount to be Withdrawl: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS: ");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount cannot be negative: ");
            return 0;
        } else {

            return amount;
        }
    }
}
