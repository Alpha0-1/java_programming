import java.util.*;

/**
 * Implements a custom collection by extending AbstractCollection.
 * This is a simplified read-only collection for demonstration purposes.
 */
public class CustomCollectionExample extends AbstractCollection<String> {
    private final String[] data = {"Alpha", "Beta", "Gamma"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public String next() {
                return data[index++];
            }
        };
    }

    @Override
    public int size() {
        return data.length;
    }

    public static void main(String[] args) {
        CustomCollectionExample collection = new CustomCollectionExample();

        System.out.println("Custom Collection contents:");
        for (String item : collection) {
            System.out.println(item);
        }
    }
}
