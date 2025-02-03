
import java.util.Scanner;

public  class MadLibsGame{
      public static void main(String[] args) {
      //     Mad Libs Game

            String adjective1;
            String noun1;
            String adjective2;
            String verb1;
            String adjective3;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an adjective: (description) ");
            adjective1 = scanner.nextLine();

            System.out.print("Enter an noun1: (person or place or thing) ");
            noun1 = scanner.nextLine();

            System.out.print("Enter an adjective: (description) ");
            adjective2 = scanner.nextLine();

            System.out.print("Enter an verb: (action) end with ing ");
            verb1 = scanner.nextLine();

            System.out.print("Enter an adjective: (description) ");
            adjective3 = scanner.nextLine();


            System.out.println("\nI went to a Park . I was " + adjective1);
            System.out.println("In the park. I saw " +noun1);
            System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
            System.out.println("I felt " + adjective3);
      }
}