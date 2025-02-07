
import java.util.Scanner;

public class FoodArray{
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size ;
            String[] foods;

            System.out.print("Enter the # of food you want: ");
            size = scanner.nextInt();
            scanner.nextLine();
            
            foods = new String[size];

            for(int i=0; i<foods.length; i++){
                  System.out.print("Enter the food: ");
                  foods[i] = scanner.nextLine();
            }

            for(String food : foods){
                  System.out.println(food);
            }
            scanner.close();
      }
}