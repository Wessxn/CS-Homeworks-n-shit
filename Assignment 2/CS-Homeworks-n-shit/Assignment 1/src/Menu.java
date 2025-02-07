import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Declaring variables to be used
        String name;
        String orderItem = "";
        int quantity;

        double total = 0.0; // Setting the total to 0
        final double COFFEEPRICE = 3.50; //Constant price for coffee
        final double TEAPRICE = 2.50; // Constant price for tea
        final double SMOOTHIEPRICE = 5.00; // Constant price for smoothie

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Café");
        System.out.print("Please enter your full name: ");
        name = scanner.nextLine();

        
        String[] nameSplit = name.split("\\s+"); 
        String firstName = nameSplit[0]; //Getting first name from string array
        System.out.println("Hello, " + firstName + "! Here's our menu:");
        System.out.println("1. Coffee - $3.50\n2. Tea - $2.50\n3. Smoothie - $5.00");

        System.out.println("What would you like to order? (type the drink or number)");
        if (scanner.hasNextInt()) { //Checking if input is a intger 
            int orderNumber = scanner.nextInt(); //Getting the number input
            orderItem = switch (orderNumber) {
                case 1 -> "Coffee";
                case 2 -> "Tea";
                case 3 -> "Smoothie";
                default -> orderItem; //Returns the item if it doesn't fall in any of the cases
            };
        } else {
            String orderName = scanner.nextLine(); //Getting string input 
            orderItem = switch (orderName) {
                case "Coffee" -> "Coffee";
                case "Tea" -> "Tea";
                case "Smoothie" -> "Smoothie";
                default -> orderItem;
            };
        }
        
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt(); // Getting integer input for quantity 

        total = switch (orderItem) { //Multiplies order item price by it's quantity  
            case "Coffee" -> COFFEEPRICE * quantity;
            case "Tea" -> TEAPRICE * quantity;
            case "Smoothie" -> SMOOTHIEPRICE * quantity;
            default -> total;
        };

        if (total > 20.00) {
            double discountedTotal;
            double discountedPrice = total * 0.10; //Calculating 10% from price if total is above 20 dollars
            discountedTotal = total - discountedPrice; //Removing said 10% from total price
            System.out.format("%nTotal before discount: $%.2f %n",  total);
            System.out.format("Discount applied: $%.2f %n", discountedPrice);
            System.out.format("Final amount: $%.2f %n", discountedTotal);
        }
        System.out.format("%nOrder Summary:%nName: %s%nDrink: %s%nQuantity: %S%nFinal Amount: $%.2f", firstName, orderItem, quantity, total ); //Displaying order summary
        scanner.close();
    }
}