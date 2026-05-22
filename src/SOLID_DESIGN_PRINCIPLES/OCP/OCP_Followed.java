package SOLID_DESIGN_PRINCIPLES.OCP;

import java.util.ArrayList;
import java.util.List;

// Product class representing any item in eCommerce.
class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// 1. ShoppingCart: Only responsible for Cart related business logic.
class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    // Calculates total price in cart.
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}

// 2. ShoppingCartPrinter: Only responsible for printing invoices
class ShoppingCartPrinter {
    private ShoppingCart cart;

    public ShoppingCartPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Shopping cart invoice..");
        for (Product p : cart.getProducts()) {
            System.out.println("Name: " + p.name + " Rs: " + p.price);
        }
        System.out.println("Total: Rs- " + cart.calculateTotal());
    }
}

interface Persistence {
    void save(ShoppingCart cart);
}

class SQLPersistence implements Persistence {
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to SQL DB...");
    }
}

class MongoDbPersistence implements Persistence {
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to MongoDB...");
    }
}

class FilePersistence implements Persistence {
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to a file...");
    }
}

public class OCP_Followed {
    static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 2000));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();

        Persistence db = new SQLPersistence();
        Persistence mongo = new MongoDbPersistence();
        Persistence file = new FilePersistence();

        db.save(cart);    // Save to SQL database
        mongo.save(cart); // Save to MongoDB
        file.save(cart);  // Save to File
    }
}
