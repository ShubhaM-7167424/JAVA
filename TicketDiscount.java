
public class TicketDiscount {

    public static void main(String[] args) {
        // Ticket Discount for Students and Senior

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 100;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get Student Discount of 10% ");
                System.out.println("You get Senior Discount of 20% ");
                price *= 0.7;
            } else {
                System.out.println("You get Student Discount of 10% ");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get Senior Discount of 20% ");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }

        System.out.printf("The Ticket cost is $%.2f ", price);
    }
}
