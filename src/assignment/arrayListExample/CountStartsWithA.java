package assignment.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountStartsWithA {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Zeel","Vinit","Aarav"));
        int count = 0;
        boolean found = false;
        for (String name : names) {
            if(name.startsWith("A")){
                count++;
                found = true;
                System.out.println("Number of Strings Starts with A: " + count);
            }
        }
        if(!found){
            System.out.println("No Strings Starts with A");
        }
    }
}
