//package SOLID_DESIGN_PRINCIPLES.SRP;
//
//import java.util.ArrayList;
//import java.util.List;
//// Product class representing any item of any ECommerce.
//class Product{
//    String name;
//    double price;
//    Product(String name,Double price){
//        this.name=name;
//        this.price=price;
//    }
//}
//// Violating SRP: ShoppingCart is handling multiple responsibilities
//class ShoppingCart{
//    List<Product>products=new ArrayList<>();
//
//    void addProduct(Product p){
//        products.add(p);
//    }
//
//    List<Product>getProducts(){
//        return products;
//    }
//    // 1. Calculates total price in cart.
//    double calculateTotal(){
//        double total=0;
//        for(Product p:products){
//            total+=p.price;
//        }
//        return total;
//    }
//    // 2. Violating SRP - Prints invoice (Should be in a separate class)
//
//    void printInvoice(){
//        System.out.println("Shopping Cart Invoice");
//        for(Product p:products){
//            System.out.println(p.name+" -Rs "+p.price);
//        }
//        System.out.println("Total: Rs "+calculateTotal());
//    }
//    // 3. Violating SRP - Saves to DB (Should be in a separate class)
//
//    void saveToDatabase(){
//        System.out.println("Saving shopping cart to database...");
//    }
//}
//public class SRP_Violated {
//    static void main(String[] args) {
//        ShoppingCart cart=new ShoppingCart();
//        cart.addProduct(new Product("Laptop",50000.0));
//        cart.addProduct(new Product("Mouse",500.0));
//        cart.printInvoice();
//        cart.saveToDatabase();
//    }
//}
