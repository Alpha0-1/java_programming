/**
 * 1-runnable_interface.java
 * Demonstrates creating threads by implementing the Runnable interface.
 */

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        // Create Runnable task
        Runnable task = new MyRunnable();

        // Create threads from the same task
        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
