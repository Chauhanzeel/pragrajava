//Remove the lowest and highest element (pollFirst, pollLast).
package assignment.treeSetExample;

import java.util.TreeSet;

public class RemoveHighestLowest {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(5);

        System.out.println("list "+numbers);

        int RemoveHighest = numbers.pollFirst();
        System.out.println("First element is: " + RemoveHighest);

        int removeLowest = numbers.pollLast();
        System.out.println("Last element is: " + removeLowest);
    }
}
