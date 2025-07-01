/**
 * 6-concurrent_collections.java
 * Demonstrates concurrent collections like ConcurrentHashMap.
 */

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionsExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        // Thread 1 puts data
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put("Key-" + i, "Value-" + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 reads data
        Thread t2 = new Thread(() -> {
            while (map.size() < 5) {
                System.out.println("Map contents: " + map);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Final Map: " + map);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
