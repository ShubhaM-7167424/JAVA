
import java.util.Random;
import java.util.Scanner;

public  class  DiceRoller{
      public static void main(String[] args) {
      //     JAVA DICE ROLLER PROGRAM

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int noOfDice;
            int total = 0;
            // GET # OF DICE FROM THE USERS
            System.out.print("Enter the noOfDice : ");
            noOfDice = scanner.nextInt();
            // CHECK IF # OF DICE > 0

            if(noOfDice > 0){
                  for(int i=0; i<noOfDice; i++){
                        int roll = random.nextInt(1,7);
                        displayDie(roll);
                        total += roll;
                        System.out.println("You rolled : " + roll);
                  }
                  System.out.println("\nTotal Count: " +total);
            }else{
                  System.out.println("Number of Dice cannot be negative: ");
            }
           
            // DISPLAY ASCII OF DICE

            scanner.close();
      }

      static  void displayDie(int roll){
            String dice1 = """
                               -------
                              |       | 
                              |   o   | 
                              |       | 
                               -------

                              """;

            String dice2 = """
                               -------
                              |       | 
                              |o     o| 
                              |       | 
                               -------

                              """;
            String dice3 = """
                               -------
                              | o     | 
                              |   o   | 
                              |     o | 
                               -------

                              """;    

            String dice4= """
                               -------
                              |o     o|
                              |       | 
                              |o     o| 
                               -------

                              """;
            String dice5= """
                               -------
                              |o     o|
                              |   o   |
                              |o     o| 
                               -------

                              """;
            String dice6= """
                               -------
                              |o     o|
                              |o     o|
                              |o     o| 
                               -------

                              """;

            switch(roll){
                  case 1 -> System.out.print(dice1);
                  case 2 -> System.out.print(dice2);
                  case 3 -> System.out.print(dice3);
                  case 4 -> System.out.print(dice4);
                  case 5 -> System.out.print(dice5);
                  case 6 -> System.out.print(dice6);
                  default -> System.out.println("INVALID ROLL");
            }
      }
}