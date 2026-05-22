package SOLID_DESIGN_PRINCIPLES.SRP;

import java.util.ArrayList;
import java.util.List;

// Product class representing any item in eCommerce.
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// 1. ShoppingCart: Only responsible for Cart related business logic.
class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    List<Product> getProducts() {
        return products;
    }

    // Calculates total price in cart.
    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}
// 2. ShoppingCartPrinter: Only responsible for printing invoices
class ShoppingCartPrinter{
    private ShoppingCart cart;
    ShoppingCartPrinter(ShoppingCart cart){
        this.cart=cart;
    }
    void printInvoice(){
        System.out.println("Shopping cart invoice..");
        for(Product p:cart.getProducts()){
            System.out.println("Name: "+p.name+" Rs: "+p.price);
        }
        System.out.println("Total: Rs- "+cart.calculateTotal());
    }
}
// 3. ShoppingCartStorage: Only responsible for saving cart to DB
class ShoppingCartStorage{
    private ShoppingCart cart;
    ShoppingCartStorage(ShoppingCart cart){
        this.cart=cart;
    }
    void saveToDatabase(){
        System.out.println("Saving shopping cart to database...");
    }
}

public class SRP_Followed {
    static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(new Product("Laptop",50000));
        cart.addProduct(new Product("Mouse",500));
        ShoppingCartPrinter printer=new ShoppingCartPrinter(cart);
        printer.printInvoice();
        ShoppingCartStorage storage=new ShoppingCartStorage(cart);
        storage.saveToDatabase();
    }
}
