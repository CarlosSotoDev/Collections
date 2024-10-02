package LIstListas;

public class ArrayList {
    public static void main(String[] args) {
        //Collection ArrayList
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        //Add Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("Orange");
        System.out.println(list + "\n");

        //The collection works with index
        System.out.println("Index number 0: " + list.get(0));
        System.out.println("Index number 1: " + list.get(1) + "\n");

        //Update Element
        list.set(1, "Coconut");
        System.out.println("Updated list: " + list + "\n");

        //Delete element
        //If you remove an element in the middle, end, or start of the collection, the other elements will automatically shift.
        //[Apple, Coconut, Grape, Orange]
        //[ 0,      1,      2,      3] Index
        //For example if you remove Apple the list will shift and he new order is:
        //[Coconut, Grape, Orange]
        //[ 0,      1,      2] Index
        list.remove(3);
        System.out.println("Updated list without the index 3: " + list + "\n");

        //Show list size
        System.out.println("Size of list with index: " + list.size());

    }
}