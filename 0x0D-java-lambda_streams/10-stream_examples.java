import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

/**
 * Real-world examples using Java Streams.
 */
public class StreamExamples {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200.0),
            new Product("Phone", 800.0),
            new Product("Tablet", 400.0),
            new Product("Monitor", 300.0)
        );

        // Filter and sort expensive products
        List<Product> expensiveProducts = products.stream()
                .filter(p -> p.getPrice() > 500)
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(toList());

        // Get total price
        double totalPrice = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        // Partition based on price
        Map<Boolean, List<Product>> partitioned = products.stream()
                .collect(partitioningBy(p -> p.getPrice() > 600));

        System.out.println("Expensive Products: " + expensiveProducts);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Partitioned by price > $600: " + partitioned);
    }

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }

        @Override
        public String toString() {
            return name + " ($" + price + ")";
        }
    }
}
