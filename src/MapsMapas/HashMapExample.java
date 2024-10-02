package MapsMapas;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Collection HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Grape");
        map.put(4, "Orange");
        System.out.println("HashMap: " + map + "\n");

        // Access value by key
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 3: " + map.get(3) + "\n");

        // Update value for a key
        map.put(2, "Coconut");
        System.out.println("Updated HashMap: " + map + "\n");

        // Remove a key-value pair
        map.remove(4);
        System.out.println("HashMap after removal: " + map + "\n");

        // Show HashMap size
        System.out.println("Size of HashMap: " + map.size());

        // Iterate over the HashMap
        System.out.println("\nIterating over the HashMap:");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
