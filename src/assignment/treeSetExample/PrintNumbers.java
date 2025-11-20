//Print all elements less than a given number.
package assignment.treeSetExample;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.print("How many numbers you want to enter? ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter a number to find elements less than it: ");
        int value = sc.nextInt();

        SortedSet<Integer> element = numbers.headSet(value);

        //tailSet(value) = greater then or equal to
        //tailSet(value + 1) = greater then
        //subSet(a,b) = elements between this range

        System.out.println("Elements less than " + value +"are : " + element);
    }
}
