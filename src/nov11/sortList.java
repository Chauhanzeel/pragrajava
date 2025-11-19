package nov11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class sortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,23,434,53,6,343,534,64,43,23,53));

        HashSet<Integer> set = new HashSet<>(list);
       System.out.println(set);

    }
}
