
import java.util.Scanner;

public class CompoundInterest{
      public static void main(String[] args) {

      //      Compound Interest Calculator
      //      A = P[1 + r/n]^nt

            Scanner scanner = new Scanner(System.in);

            double principal ;
            double rate ;
            int compoundedTime;
            int years;
            double amount;

            System.out.print("Enter the principal ");
            principal  = scanner.nextDouble();

            System.out.print("Enter the rate in % ");
            rate = scanner.nextDouble()/100;

            System.out.print("Enter the compunded time ");
            compoundedTime = scanner.nextInt();

            System.out.print("Enter the time in years ");
            years = scanner.nextInt();

            amount = principal * Math.pow(1 + rate/compoundedTime, compoundedTime*years);

            System.out.printf("The compunded amount of %d years is %.2f ", years, amount);

            scanner.close();

      }
}