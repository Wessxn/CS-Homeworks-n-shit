import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String name;
        String orderItem = "";
        int quantity;
        double total = 0.0;
        final double COFFEEPRICE = 3.50;
        final double TEAPRICE = 2.50;
        final double SMOOTHIEPRICE = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Café");
        System.out.print("Please enter your full name: ");
        name = scanner.nextLine();

        String[] nameSplit = name.split("\\s+");
        String firstName = nameSplit[0];
        System.out.println("Hello, " + firstName + "! Here's our menu:");
        System.out.println("1. Coffee - $3.50\n2. Tea - $2.50\n3. Smoothie - $5.00");

        System.out.println("What would you like to order? (type the drink or number)");
        if (scanner.hasNextInt()) {
            int orderNumber = scanner.nextInt();
            orderItem = switch (orderNumber) {
                case 1 -> "Coffee";
                case 2 -> "Tea";
                case 3 -> "Smoothie";
                default -> orderItem;
            };
        } else {
            String orderName = scanner.nextLine();
            orderItem = switch (orderName) {
                case "Coffee" -> "Coffee";
                case "Tea" -> "Tea";
                case "Smoothie" -> "Smoothie";
                default -> orderItem;
            };
        }
        System.out.print("Enter quantity: ");
        Scanner quantScan = new Scanner(System.in);
        quantity = quantScan.nextInt();
        quantScan.close();

        total = switch (orderItem) {
            case "Coffee" -> COFFEEPRICE * quantity;
            case "Tea" -> TEAPRICE * quantity;
            case "Smoothie" -> SMOOTHIEPRICE * quantity;
            default -> total;
        };

        if (total > 20.00) {
            double discountedTotal;
            double discountedPrice = total * 0.10;
            discountedTotal = total - discountedPrice;
            System.out.format("%nTotal before discount: $%.2f %n",  total);
            System.out.format("Discount applied: $%.2f %n", discountedPrice);
            System.out.format("Final amount: $%.2f %n", discountedTotal);
        }
        System.out.format("%nOrder Summary:%nName: %s%nDrink: %s%nQuantity: %S%nFinal Amount: $%.2f", firstName, orderItem, quantity, total );
        scanner.close();
    }
}