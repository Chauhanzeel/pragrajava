//Add elements with duplicates and verify insertion order is maintained.
package assignment.linkedHashSetExample;

import java.util.LinkedHashSet;

public class AddElements {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Zeel");
        names.add("Vinit");
        names.add("Zeel");
        names.add("Khushi");

        System.out.println("Names List: "+names);
    }
}
