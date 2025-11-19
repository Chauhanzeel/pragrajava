package assignment.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,10,50,20));
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (!uniqueList.contains(num)) //returns boolean value
            {
                uniqueList.add(num);
            }
        }
        System.out.println("Maximum number from arrayList is: " + uniqueList);
    }
}
