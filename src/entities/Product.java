package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValeuInStock(){
        return price * quantity;
    }

    public void addProducts(int newProduct) {
        quantity += newProduct;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ": $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units. Total: $ "
                + String.format("%.2f", totalValeuInStock());
    }
}
