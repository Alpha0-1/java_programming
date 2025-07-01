/**
 * 0-thread_creation.java
 * Demonstrates creating threads by extending the Thread class.
 */

public class ThreadCreationExample extends Thread {
    @Override
    public void run() {
        // Code executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Create two threads
        ThreadCreationExample t1 = new ThreadCreationExample();
        ThreadCreationExample t2 = new ThreadCreationExample();

        // Start the threads
        t1.start(); // Calls run()
        t2.start();
    }
}
