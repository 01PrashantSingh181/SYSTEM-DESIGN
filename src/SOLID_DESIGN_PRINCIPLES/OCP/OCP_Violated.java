package SOLID_DESIGN_PRINCIPLES.OCP;

import java.util.ArrayList;
import java.util.List;

//// Product class representing any item in eCommerce.
//class Product {
//    public String name;
//    public double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//}
//// 1. ShoppingCart: Only responsible for Cart related business logic.
//class ShoppingCart {
//    private List<Product> products = new ArrayList<>();
//
//    public void addProduct(Product p) {
//        products.add(p);
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    // Calculates total price in cart.
//    public double calculateTotal() {
//        double total = 0;
//        for (Product p : products) {
//            total += p.price;
//        }
//        return total;
//    }
//}
//// 2. ShoppingCartPrinter: Only responsible for printing invoices
//class ShoppingCartPrinter{
//    private ShoppingCart cart;
//    public ShoppingCartPrinter(ShoppingCart cart){
//        this.cart=cart;
//    }
//    public void printInvoice(){
//        System.out.println("Shopping cart invoice..");
//        for(Product p:cart.getProducts()){
//            System.out.println("Name: "+p.name+" Rs: "+p.price);
//        }
//        System.out.println("Total: Rs- "+cart.calculateTotal());
//    }
//}
// 3. ShoppingCartStorage: Only responsible for saving cart to DB
//class ShoppingCartStorage{
//    private ShoppingCart cart;
//    public ShoppingCartStorage(ShoppingCart cart){
//        this.cart=cart;
//    }
//    void saveToSQLDatabase() {
//        System.out.println("Saving shopping cart to SQL DB...");
//    }
//    void saveToMongoDatabase() {
//        System.out.println("Saving shopping cart to Mongo DB...");
//    }
//    void saveToFile() {
//        System.out.println("Saving shopping cart to File...");
//    }
//
//}
//
//public class OCP_Violated {
//    static void main(String[] args) {
//        ShoppingCart cart = new ShoppingCart();
//
//        cart.addProduct(new Product("Laptop", 50000));
//        cart.addProduct(new Product("Mouse", 2000));
//
//        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
//        printer.printInvoice();
//
//        ShoppingCartStorage db = new ShoppingCartStorage(cart);
//        db.saveToSQLDatabase();
//    }
//}
