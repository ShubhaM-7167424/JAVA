
import java.util.Scanner;


public  class  Primitive_data_Type{
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            // Common Issue

            // nextInt() only eats numbers

            // nextLine() eats everything until it finds an Enter key [1]

            // When you use nextInt(), it leaves the Enter key behind

            // Adding an extra nextLine() eats up that leftover Enter key [2]

            // Now your next nextLine() starts fresh! [3]

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your favourite Color: ");
            String color = scanner.nextLine();

            System.out.println("You are " +age + " years old");
            System.out.println("You like the color " +color);


            scanner.close();
      }
}
