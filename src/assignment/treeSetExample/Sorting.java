//Add random numbers to a TreeSet and display them — sorted automatically.
package assignment.treeSetExample;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.print("How many numbers you want to add? ");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        System.out.println("Sorted Numbers (TreeSet): " +numbers);
    }
}
