package QueueColas;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Collection ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.add("Grape");  // Default adds to the tail
        deque.addLast("Orange");
        System.out.println("ArrayDeque: " + deque + "\n");

        // Access first and last elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast() + "\n");

        // Remove elements from both ends
        deque.removeFirst();
        deque.removeLast();
        System.out.println("ArrayDeque after removing first and last elements: " + deque + "\n");

        // Show deque size
        System.out.println("Size of ArrayDeque: " + deque.size());

        // ArrayDeque properties: Efficient for adding/removing from both ends
        deque.addFirst("Mango");
        deque.addLast("Pineapple");
        System.out.println("Updated ArrayDeque: " + deque);
    }
}
