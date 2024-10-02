package MapsMapas;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Collection TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Grape");
        map.put(4, "Orange");
        System.out.println("TreeMap: " + map + "\n");

        // Access value by key
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 3: " + map.get(3) + "\n");

        // Update value for a key
        map.put(2, "Coconut");
        System.out.println("Updated TreeMap: " + map + "\n");

        // Remove a key-value pair
        map.remove(4);
        System.out.println("TreeMap after removal: " + map + "\n");

        // Show TreeMap size
        System.out.println("Size of TreeMap: " + map.size());

        // TreeMap properties: Elements are sorted by key
        System.out.println("\nTreeMap in ascending order of keys:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {  // Corrección aquí
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Access first and last keys
        System.out.println("\nFirst key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
    }
}
