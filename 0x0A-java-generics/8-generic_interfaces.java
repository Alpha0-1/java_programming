/**
 * Demonstrates the use of generic interfaces in Java.
 * Interfaces can define generic behavior applicable to many types.
 */
interface Repository<T> {
    void save(T item);
    T findById(int id);
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}

class UserRepository implements Repository<User> {
    public void save(User user) {
        System.out.println("Saving user: " + user);
    }

    public User findById(int id) {
        return new User(id, "John Doe");
    }
}

public class GenericInterfaces {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        User user = new User(1, "Alice");
        repo.save(user);
        System.out.println("Found: " + repo.findById(1));
    }
}
