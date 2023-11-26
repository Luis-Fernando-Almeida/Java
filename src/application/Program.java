package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("PC");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price " +product.getPrice());

        sc.nextLine();

        System.out.println();
        System.out.println("Product data: " + product);

        boolean turnoff = false;

        while (!turnoff) {
            System.out.println("Do you want to add or remove items from stock? Type: Add or Remove (Type 'Exit' to leave) ");
            String stock = sc.nextLine();
              if (stock.equalsIgnoreCase("Add")) {
                System.out.print("Enter the number of products to be added in stock: ");
                int quantity = sc.nextInt();
                sc.nextLine();
                product.addProducts(quantity);
            } else if (stock.equalsIgnoreCase("Remove")) {
                System.out.print("Enter the number of products to be removed from stock: ");
                int quantity = sc.nextInt();
                System.out.println();
                sc.nextLine();
                product.removeProducts(quantity);
            } else if (stock.equalsIgnoreCase("Exit")) {
                turnoff = true;

              } else {
                System.out.println("Invalid option. Please type 'Add', 'Remove' or 'Exit'");
            }
            System.out.println("Updated data: " + product);
        }
        System.out.println("Program exited");
        sc.close();
    }
}
