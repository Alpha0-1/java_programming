/**
 * 10-thread_best_practices.java
 * Shows best practices such as:
 * - Always handle InterruptedException
 * - Avoid blocking calls in constructors
 * - Use daemon threads where appropriate
 * - Prefer ExecutorService over raw threads
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadBestPracticesExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(() -> {
            try {
                System.out.println("Starting background task...");
                Thread.sleep(1000);
                System.out.println("Background task complete.");
            } catch (InterruptedException e) {
                System.out.println("Task was interrupted.");
                Thread.currentThread().interrupt(); // Re-assert interrupt
            }
        });

        // Don't block main thread unnecessarily
        System.out.println("Main thread continues execution.");

        executor.shutdown();
    }
}
