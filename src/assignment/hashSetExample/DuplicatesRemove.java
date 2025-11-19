//Convert a List to a Set and back to List — show duplicate removal.
package assignment.hashSetExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicatesRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,23,434,53,6,343,534,64,43,23,53));

        HashSet<Integer> set = new HashSet<>(list);

        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println(uniqueList);

    }
}
