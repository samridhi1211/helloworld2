package Recursion; 
import java.util.Scanner;

public class RecursiveMenuProgram {

    // Menu items and prices
    static String[] menuItems = {"Pizza", "Burger", "Pasta", "Salad", "Soda"};
    static double[] prices = {10.99, 7.49, 8.99, 5.99, 2.49};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu(scanner); // Start the recursive menu
        scanner.close();
    }

    // Recursive method to display the menu and handle choices
    public static void displayMenu(Scanner scanner) {
        // Display the menu
        System.out.println("\n=== Menu ===");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, menuItems[i], prices[i]);
        }
        System.out.println("0. Exit");

        // Ask the user to select an option
        System.out.print("\nEnter your choice (0 to exit): ");
        int choice = scanner.nextInt();

        // Handle user choice
        if (choice == 0) {
            System.out.println("Thank you for visiting! Goodbye!");
            return; // End recursion
        } else if (choice > 0 && choice <= menuItems.length) {
            System.out.printf("You selected: %s. Price: $%.2f%n", menuItems[choice - 1], prices[choice - 1]);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        // Call the method again for the next choice
        displayMenu(scanner);
    }
}