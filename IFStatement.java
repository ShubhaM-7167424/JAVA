
import java.util.Scanner;

public  class IFStatement{
      public static void main(String[] args) {
      //     if statement = performs a block of code if its condition is true

            Scanner scanner = new Scanner(System.in);

            int age ;
            String name;
            boolean isStudent=false;

            System.out.print("Enter your name? ");
            name = scanner.nextLine();

            System.out.print("Enter your age ? ");
            age = scanner.nextInt();

            System.out.print("Are you a Student ? (true/false) ");
            isStudent = scanner.nextBoolean();

            // GROUP 1            

            if(name.isEmpty()){
                  System.out.println("\nYou didn't enter your name!");
            }else{
                  System.out.println("\nHello " + name + "!" );
            }

            // GROUP 2

            if(age > 60){
                  System.out.println("You are Senior citizen! 🙋");
            }
            else if(age > 18){
                  System.out.println("You are an Adult! 👨‍🦰");
            }
            else if(age == 0){
                  System.out.println("You are a baby! 👶");
            }else if(age < 0){
                  System.out.println("You are not born Yet! 😵‍💫");
            }
            else{
                  System.out.println("You are a child! 🧒");
            }

            // GROUP 3
            if(isStudent){
                  System.out.println("You are a Student! 👩‍🎓");
            }else{
                  System.out.println("You are not a Student! 👨‍💼");
            }


            scanner.close();
      }
}