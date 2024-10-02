package QueueColas;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Collection PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(15);
        queue.add(5);
        System.out.println("PriorityQueue: " + queue + "\n");

        // PriorityQueue automatically orders elements according to natural ordering (min-heap by default)
        System.out.println("Peek element (highest priority): " + queue.peek());

        // Remove the element with the highest priority (the smallest one)
        queue.poll();
        System.out.println("PriorityQueue after poll: " + queue + "\n");

        // Show queue size
        System.out.println("Size of PriorityQueue: " + queue.size());

        // PriorityQueue properties: Elements are ordered based on priority
        queue.add(1);
        System.out.println("PriorityQueue with new element (priority handled automatically): " + queue);
    }
}
