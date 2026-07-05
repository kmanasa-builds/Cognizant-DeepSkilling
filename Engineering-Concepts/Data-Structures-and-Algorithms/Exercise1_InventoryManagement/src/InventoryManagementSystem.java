import java.util.HashMap;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        HashMap<Integer, Product> inventory = new HashMap<>();

        // Add products
        inventory.put(101, new Product(101, "Laptop", 10, 50000));
        inventory.put(102, new Product(102, "Mouse", 50, 500));
        inventory.put(103, new Product(103, "Keyboard", 30, 1000));

        System.out.println("Products after adding:");
        inventory.values().forEach(System.out::println);

        // Update product
        Product p = inventory.get(102);

        if (p != null) {
            p.setQuantity(60);
            p.setPrice(550);
        }

        System.out.println("\nAfter Updating Product 102:");
        inventory.values().forEach(System.out::println);

        // Delete product
        inventory.remove(103);

        System.out.println("\nAfter Deleting Product 103:");
        inventory.values().forEach(System.out::println);
    }
}