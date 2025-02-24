import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        int total_bill = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Pizza Bungalow! What would you like to have today?");
            System.out.println("1. Pizza");
            System.out.println("2. Drinks");
            System.out.println("3. Fries");
            System.out.println("4. Coffee");
            System.out.println("5. Exit");
            System.out.println("Please choose one option:");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("1. Large Pizza - $99");
                    System.out.println("2. Medium Pizza - $69");
                    System.out.println("3. Small Pizza - $40");
                    System.out.println("Select size:");

                    int size = sc.nextInt();
                    switch (size) {
                        case 1:
                            total_bill += 99;
                            break;
                        case 2:
                            total_bill += 69;
                            break;
                        case 3:
                            total_bill += 40;
                            break;
                        default:
                            System.out.println("Invalid size selection!");
                            continue; // Restart loop
                    }
                    break;

                case 2:
                    System.out.println("Drinks - $20 added to bill.");
                    total_bill += 20;
                    break;

                case 3:
                    System.out.println("Fries - $30 added to bill.");
                    total_bill += 30;
                    break;

                case 4:
                    System.out.println("Coffee - $25 added to bill.");
                    total_bill += 25;
                    break;

                case 5:
                    System.out.println("\nThank you for ordering!");
                    System.out.println("Total Bill: $" + total_bill);
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose again.");
                    continue;
            }

            System.out.println("\nDo you want to order anything else? (yes/no)");
            String response = sc.next();

            if (response.equalsIgnoreCase("no")) {
                System.out.println("\nThank you for visiting Pizza Bungalow!");
                System.out.println("Total Bill: $" + total_bill);
                break;
            }
        }

        sc.close();
    }
}
