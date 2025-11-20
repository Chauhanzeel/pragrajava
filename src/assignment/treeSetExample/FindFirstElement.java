//Find first and last elements in a TreeSet.
package assignment.treeSetExample;

import java.util.Iterator;
import java.util.TreeSet;

public class FindFirstElement {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Sorted Fruits: "+fruits);

        String firstElement = fruits.first();
        System.out.println("First element is: " + firstElement);

        String lastElement = fruits.last();
        System.out.println("Last element is: " + lastElement);

    }
}
