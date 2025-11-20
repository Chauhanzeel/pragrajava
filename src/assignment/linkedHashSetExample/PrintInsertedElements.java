//Iterate and print elements in insertion order.
package assignment.linkedHashSetExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PrintInsertedElements {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Zeel");
        names.add("Vinit");
        names.add("Zeel");
        names.add("Khushi");

        System.out.println("Names in insertion order: "+names);
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
