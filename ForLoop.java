
import java.util.Scanner;

public class ForLoop{
      public static void main(String[] args) {
      //     for loop => when you want to iterate a code certain number of times

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter how many times you want to loop: ");
            int max = scanner.nextInt();

            for(int i=1; i <= max; i++){
                  System.out.println(i);
            }

            scanner.close();
      }
}