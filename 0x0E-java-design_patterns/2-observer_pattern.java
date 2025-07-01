/**
 * @file 2-observer_pattern.java
 * @brief Observer Pattern Implementation
 *
 * Allows an object (subject) to notify a list of dependents (observers) automatically when its state changes.
 */

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification: " + message);
        notifyObservers(message);
    }
}

public class MainObserver {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        service.addObserver(user1);
        service.addObserver(user2);

        service.sendNotification("System will restart at 10 PM.");

        service.removeObserver(user1);
        service.sendNotification("System restarted.");
    }
}
