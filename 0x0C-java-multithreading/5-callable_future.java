/**
 * 5-callable_future.java
 * Demonstrates using Callable and Future to retrieve results from threads.
 */

import java.util.concurrent.*;

class SquareTask implements Callable<Integer> {
    private final int number;

    public SquareTask(int num) {
        this.number = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return number * number;
    }
}

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a callable task
        Future<Integer> future = executor.submit(new SquareTask(5));

        System.out.println("Doing something else...");

        // Retrieve result when available
        Integer result = future.get(); // Blocking call
        System.out.println("Result from thread: " + result);

        executor.shutdown();
    }
}
