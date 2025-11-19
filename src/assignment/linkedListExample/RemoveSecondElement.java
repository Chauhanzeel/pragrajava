package assignment.linkedListExample;

import java.util.LinkedList;

public class RemoveSecondElement {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int count = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (count % 2 == 0) {
                numbers.remove(i);
            }
            count++;
        }

        System.out.println("LinkedList after removing every 2nd element: " + numbers);
    }
}
