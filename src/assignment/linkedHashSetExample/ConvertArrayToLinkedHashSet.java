//Convert an array to LinkedHashSet to remove duplicates but keep order.
package assignment.linkedHashSetExample;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ConvertArrayToLinkedHashSet {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 60, 40, 20};

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("array is: "+Arrays.toString(arr));
        System.out.println("LinkedHashSet: "+linkedHashSet);
    }
}
