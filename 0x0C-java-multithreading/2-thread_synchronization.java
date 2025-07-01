/**
 * 2-thread_synchronization.java
 * Demonstrates synchronization to avoid race conditions.
 */

class Counter {
    private int count = 0;

    // Synchronized method ensures only one thread can execute at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads trying to increment simultaneously
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final count should be 2000: " + counter.getCount());
    }
}
