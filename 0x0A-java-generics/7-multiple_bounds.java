/**
 * Demonstrates multiple bounds for a generic type parameter.
 * The type must satisfy all specified bounds.
 */
interface Movable {
    void move();
}

class Vehicle implements Movable {
    public void move() {
        System.out.println("Vehicle is moving.");
    }
}

public class MultipleBoundsExample {

    /**
     * Generic method with multiple bounds.
     * @param <T> Must be both a Number and Movable
     */
    public static <T extends Number & Movable> void process(T item) {
        System.out.println("Processing item: " + item.doubleValue());
        item.move();
    }

    public static void main(String[] args) {
        // Custom class example
        class Car extends Number implements Movable {
            public void move() {
                System.out.println("Car is driving.");
            }

            public int intValue() { return 1; }
            public long longValue() { return 1L; }
            public float floatValue() { return 1.0f; }
            public double doubleValue() { return 1.0; }
        }

        Car car = new Car();
        process(car);
    }
}
