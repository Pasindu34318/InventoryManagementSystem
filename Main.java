
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = scanner.nextInt();

                    Product product = new Product(id, name, price, quantity);
                    inventory.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    
                    System.out.print("Enter Product ID to update quantity: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter Quantity to add (negative to subtract): ");
                    int updateQuantity = scanner.nextInt();

                    inventory.updateProductQuantity(updateId, updateQuantity);
                    System.out.println("Quantity updated successfully!");
                    break;

                case 3:
                    
                    System.out.println("\n=== Inventory List ===");
                    inventory.displayInventory();
                    break;

                case 4:
                    
                    System.out.println("Exiting system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
