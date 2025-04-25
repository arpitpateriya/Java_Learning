package Rbu;

import java.util.LinkedList;
import java.util.Iterator;

public class FlowerLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList to store flower names
        LinkedList<String> flowers = new LinkedList<>();

        // Adding elements to the LinkedList
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Lily");
        flowers.add("Daffodil");
        flowers.add("Orchid");

        System.out.println("Initial list of flowers: " + flowers);

        // Adding a flower at the beginning and end
        flowers.addFirst("Sunflower");
        flowers.addLast("Marigold");

        System.out.println("After adding at beginning and end: " + flowers);

        // Removing elements
        flowers.remove("Lily");              // by value
        flowers.remove(2);                   // by index
        flowers.removeFirst();               // first element
        flowers.removeLast();                // last element

        System.out.println("After removals: " + flowers);

        // Searching for a flower
        String searchFlower = "Tulip";
        if (flowers.contains(searchFlower)) {
            System.out.println(searchFlower + " is in the list.");
        } else {
            System.out.println(searchFlower + " is not in the list.");
        }

        // Retrieving an element by index
        int index = 1;
        if (index >= 0 && index < flowers.size()) {
            String flower = flowers.get(index);
            System.out.println("Flower at index " + index + " is " + flower);
        } else {
            System.out.println("Invalid index");
        }

        // Iterating over the list using Iterator
        System.out.println("Iterating through the list:");
        Iterator<String> iterator = flowers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
