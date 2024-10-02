package LIstListas;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Collection LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("Orange");
        System.out.println(list + "\n");

        // The collection works with index
        System.out.println("Index number 0: " + list.get(0));
        System.out.println("Index number 1: " + list.get(1) + "\n");

        // Update Element
        list.set(1, "Coconut");
        System.out.println("Updated list: " + list + "\n");

        // Remove element (similar to ArrayList, it shifts automatically)
        list.remove(3);
        System.out.println("Updated list without the index 3: " + list + "\n");

        // Show list size
        System.out.println("Size of list with index: " + list.size());

        // LinkedList properties: Add/Remove from the beginning or end efficiently
        list.addFirst("Mango");
        list.addLast("Pineapple");
        System.out.println("Updated list with new first and last elements: " + list);
    }
}
