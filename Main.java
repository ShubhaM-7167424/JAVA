

public  class  Main{
    
    public static void main(String[] args) {
        
        int age=55;
        int year=2025;
        int quantity = 1;

        double price = 18999;
        double gpa = 3.5;
        double temperature = -13.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Bro Code";
        String food = "Pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "Red";

        System.out.println("Your choice is a " +color+ " " +year+ " " +car);
        System.out.println("The price is " +currency +price);

        if(forSale){
            System.out.println("There is a " + car + " for sale.");            
        }else{
            System.out.println("The " +car + " is not for sale.");
        }
    }
}   