package SetConjuntos;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Collection HashSet
        HashSet<String> set = new HashSet<>();

        // Add Elements
        set.add("Apple");
        set.add("Banana");
        set.add("Grape");
        set.add("Orange");
        System.out.println(set + "\n");

        // HashSet doesn't maintain order, so you cannot access elements by index
        System.out.println("Does the set contain 'Apple'? " + set.contains("Apple"));

        // Remove Element
        set.remove("Banana");
        System.out.println("Updated set without 'Banana': " + set + "\n");

        // Show set size
        System.out.println("Size of set: " + set.size());

        // HashSet property: No duplicate elements allowed
        set.add("Apple");  // Won't add because it's a duplicate
        set.add("Mango");
        System.out.println("Updated set with an attempt to add duplicate 'Apple': " + set);
    }
}
