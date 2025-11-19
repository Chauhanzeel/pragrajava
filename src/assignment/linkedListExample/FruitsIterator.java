package assignment.linkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class FruitsIterator {
    public static void main(String args[]) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
