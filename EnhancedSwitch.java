
public class EnhancedSwitch {

    public static void main(String[] args) {
        //     Enhanced switch = A replacement to many if else statements
        //                        (Java14 feature)

        String day = "Saturday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday" ->
                System.out.println("It is a weekday: ");
            case "Saturday", "Sunday" ->
                System.out.println("It is a weekend: ");
            default ->
                System.out.println(day + " is not a day: ");
        }
    }
}
