//Merge 2 LinkedHashSets without losing order.
package assignment.linkedHashSetExample;

import java.util.LinkedHashSet;

public class MergeTwoSets {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Zeel");
        set1.add("Vinit");
        set1.add("Khushi");
        System.out.println("Set1: "+set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Ankia");
        set2.add("Lucy");
        set2.add("Kunjesh");
        System.out.println("Set2: "+set2);

        set1.addAll(set2);
        System.out.println("Merged Set: "+set1);
    }
}
