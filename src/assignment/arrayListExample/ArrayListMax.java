package assignment.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMax {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,23,53,6,343,534,64,43,23));
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number from arrayList is: " + max);
    }
}
