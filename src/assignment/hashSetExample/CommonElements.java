//Find common elements between two HashSets.
package assignment.hashSetExample;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        HashSet<Integer> commonElements = new HashSet<>();
        for (Integer ele : set1) {
            if (set2.contains(ele)) {
                commonElements.add(ele);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}
