/**
 * 4-thread_pool.java
 * Demonstrates using ExecutorService for managing thread pools.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing task: " + taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Task interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " completed task: " + taskName);
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a fixed-size thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit multiple tasks
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task-" + i);
            executor.execute(task);
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
