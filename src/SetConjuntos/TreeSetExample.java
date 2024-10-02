package SetConjuntos;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Collection TreeSet
        TreeSet<String> set = new TreeSet<>();

        // Add Elements
        set.add("Apple");
        set.add("Banana");
        set.add("Grape");
        set.add("Orange");
        System.out.println(set + "\n");

        // TreeSet maintains a sorted order
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last() + "\n");

        // Remove Element
        set.remove("Grape");
        System.out.println("Updated set without 'Grape': " + set + "\n");

        // Show set size
        System.out.println("Size of set: " + set.size());

        // TreeSet property: Elements are always sorted in natural order
        set.add("Mango");
        set.add("Coconut");
        System.out.println("Updated set with new elements (sorted automatically): " + set);
    }
}
