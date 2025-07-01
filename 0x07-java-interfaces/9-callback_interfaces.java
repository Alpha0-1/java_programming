/**
 * 9-callback_interfaces.java
 * Implements the callback pattern using interfaces.
 *
 * Callbacks allow asynchronous handling of events.
 */

interface TaskCallback {
    void onTaskComplete(String result);
}

class BackgroundTask {
    void execute(TaskCallback callback) {
        System.out.println("Performing background task...");
        try {
            Thread.sleep(1000);  // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.onTaskComplete("Success");
    }
}

public class Main {
    public static void main(String[] args) {
        BackgroundTask task = new BackgroundTask();
        task.execute(result -> System.out.println("Callback received: " + result));
    }
}
