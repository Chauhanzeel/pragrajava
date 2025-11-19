package assignment.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        int arraySize = list.size();

        for (int i = 0; i < arraySize / 2; i++) {
            int temp = list.get(i);
//            list.get(i)=list.get(arraySize - 1 - i);
//            list.get(arraySize - 1 - i) = temp;
        }
        System.out.println(list);
    }
}
