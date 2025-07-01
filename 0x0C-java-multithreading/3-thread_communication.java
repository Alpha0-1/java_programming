/**
 * 3-thread_communication.java
 * Demonstrates inter-thread communication using wait(), notify().
 */

class SharedResource {
    boolean isAvailable = false;

    public synchronized void consume() throws InterruptedException {
        while (!isAvailable) {
            wait(); // Wait until producer signals
        }
        System.out.println("Consumed");
        isAvailable = false;
        notify(); // Notify producer it can produce again
    }

    public synchronized void produce() throws InterruptedException {
        while (isAvailable) {
            wait(); // Wait if already produced
        }
        System.out.println("Produced");
        isAvailable = true;
        notify(); // Notify consumer it can consume
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
