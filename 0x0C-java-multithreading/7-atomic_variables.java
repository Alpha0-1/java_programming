/**
 * 7-atomic_variables.java
 * Demonstrates atomic variables for thread-safe operations without locks.
 */

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicVariablesExample {
    private static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task that increments atomically
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                atomicCount.incrementAndGet(); // Thread-safe
            }
        };

        executor.execute(task);
        executor.execute(task);

        executor.shutdown();

        try {
            Thread.sleep(2000); // Wait for completion
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Atomic count value: " + atomicCount.get());
    }
}
