package com.banking;


import java.util.Scanner;

// Parent class
class User {
    protected String name;

    User(String name) {
        this.name = name;
    }

    void displayDetails() {
        System.out.println("User Name: " + name);
    }
}

// Inheritance
class Customer extends User {

    private int customerId;

    Customer(String name, int customerId) {
        super(name);
        this.customerId = customerId;
    }

    // Method Overriding
    @Override
    void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Product class - Encapsulation
class Product {

    private int productId;
    private String productName;
    private double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    void displayProduct() {
        System.out.println(
            productId + ". " + productName + " - Rs." + price
        );
    }
}

// Shopping cart class
class ShoppingCart {

    private double total = 0;

    // Method Overloading - add one product
    void addToCart(Product product) {
        total += product.getPrice();
        System.out.println(product.getProductName() + " added");
    }

    // Method Overloading - add multiple quantities
    void addToCart(Product product, int quantity) {
        total += product.getPrice() * quantity;
        System.out.println(
            product.getProductName() + " x " + quantity + " added"
        );
    }

    void displayTotal() {
        System.out.println("Total Bill: Rs." + total);
    }
}

// Main application
public class ECommerceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of products; fourth slot is intentionally empty
        Product[] products = new Product[4];

        products[0] = new Product(1, "Laptop", 50000);
        products[1] = new Product(2, "Mobile", 20000);
        products[2] = new Product(3, "Headphones", 1500);

        Customer customer = new Customer("Rahul", 101);
        User user = customer;  // Runtime polymorphism

        user.displayDetails();

        ShoppingCart cart = new ShoppingCart();

        try {
            System.out.println("\n--- E-COMMERCE STORE ---");

            for (Product p : products) {
                if (p != null) {
                    p.displayProduct();
                }
            }

            System.out.print("\nSelect product number (1-4): ");
            String choiceInput = sc.nextLine();

            // NumberFormatException
            int choice = Integer.parseInt(choiceInput);

            // ArrayIndexOutOfBoundsException
            Product selected = products[choice - 1];

            // NullPointerException if selected slot is empty
            System.out.println(
                "Selected: " + selected.getProductName()
            );

            System.out.print("Enter quantity: ");
            String quantityInput = sc.nextLine();

            // NumberFormatException
            int quantity = Integer.parseInt(quantityInput);

            if (quantity <= 0) {
                System.out.println("Quantity must be positive.");
            } else {
                cart.addToCart(selected, quantity);
                cart.displayTotal();
            }

        } catch (NumberFormatException e) {
            System.out.println(
                "Error: Please enter a valid numeric value."
            );

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Error: Product number is outside the valid range."
            );

        } catch (NullPointerException e) {
            System.out.println(
                "Error: This product slot is empty."
            );

        } finally {
            sc.close();
            System.out.println("Thank you for shopping!");
        }
    }
}
