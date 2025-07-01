/**
 * 4-object_serialization.java - Demonstrates Java object serialization and deserialization.
 * Objects must implement Serializable interface to be saved to a file.
 */

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        String filePath = "person.ser";

        // Serialize object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            Person person = new Person("Alice", 30);
            out.writeObject(person);
            System.out.println("Object serialized.");
        } catch (IOException e) {
            System.err.println("Error serializing object: " + e.getMessage());
        }

        // Deserialize object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Person loaded = (Person) in.readObject();
            System.out.println("Deserialized object: " + loaded);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing object: " + e.getMessage());
        }
    }
}
