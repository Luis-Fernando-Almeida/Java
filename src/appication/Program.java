package appication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        sc.nextLine();

        System.out.println();
        System.out.println("Product data: " + product);

        boolean going = true;

        while (going) {
            System.out.println("Do you want to add or remove items from stock? Type: Add or Remove (Type 'Exit' to leave) ");
            String stock = sc.nextLine();
            if (stock.equalsIgnoreCase("Add")) {
                System.out.print("Enter the number of products to be added in stock: ");
                int item = sc.nextInt();
                sc.nextLine();
                product.addProducts(item);
            } else if (stock.equalsIgnoreCase("Remove")) {
                System.out.print("Enter the number of products to be removed from stock: ");
                int item = sc.nextInt();
                System.out.println();
                sc.nextLine();
                product.removeProducts(item);
            } else if (stock.equalsIgnoreCase("Exit")){
                going = false;
            } else {
                System.out.println("Invalid option. Please type 'Add', 'Remove' or 'Exit'");
            }
            System.out.println("Updated data: " + product);
        }
        sc.nextLine();
        System.out.println("Program exited");

        sc.close();
    }
}
