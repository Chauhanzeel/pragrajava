//Add duplicate numbers to a HashSet — show it stores unique values only.
package assignment.hashSetExample;

import java.util.Arrays;
import java.util.HashSet;

public class StoreUniqueElements {
    public static void main(String[] args) {
        HashSet<Integer> uniqueValues = new HashSet<>(Arrays.asList(10,23,434,53,6,343,534,64,43,23,53));

        System.out.println("list: "+uniqueValues);
    }
}
