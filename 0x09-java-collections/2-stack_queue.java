import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates Stack and Queue implementations using Stack and LinkedList.
 */
public class StackQueueExample {
    public static void main(String[] args) {
        // Stack example
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());

        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue peek: " + queue.peek());
    }
}
