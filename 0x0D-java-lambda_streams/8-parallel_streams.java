import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates parallel stream processing for performance improvement.
 */
public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> largeList = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            largeList.add(i);
        }

        // Sequential stream
        long startTime = System.currentTimeMillis();
        int sumSeq = largeList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sequential sum: " + sumSeq);
        System.out.println("Time taken (ms): " + (System.currentTimeMillis() - startTime));

        // Parallel stream
        startTime = System.currentTimeMillis();
        int sumPar = largeList.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Parallel sum: " + sumPar);
        System.out.println("Time taken (ms): " + (System.currentTimeMillis() - startTime));
    }
}
