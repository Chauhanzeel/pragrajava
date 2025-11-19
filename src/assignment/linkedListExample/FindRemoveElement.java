package assignment.linkedListExample;

import java.util.Arrays;
import java.util.LinkedList;

public class FindRemoveElement {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Khushi","Zeel","Vinit","Aarav"));

        String element = "Aarav";
        if (names.contains(element)) {
            names.remove(element);
        } else {
            System.out.println(element + " not found in the list.");
        }
        System.out.println("List After removing the element: " + names);
    }
}
