/**
 * Implements a generic Pair class that holds two related values.
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> entry = new Pair<>("Age", 25);
        System.out.println("Pair: " + entry);

        Pair<Boolean, String> flag = new Pair<>(true, "Enabled");
        System.out.println("Flag: " + flag);
    }
}
