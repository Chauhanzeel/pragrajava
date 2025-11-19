package assignment.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Khushi","Zeel","Vinit","Aarav"));
        String elementToFind = "Zeel";
        boolean found = false;
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals(elementToFind)){
                System.out.println("element found at index:"+ i);
                found = true;
            }
        }
        if(!found){
            System.out.println("not found in the list");
        }
    }
}
