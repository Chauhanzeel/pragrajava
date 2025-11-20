//Maintain sorted names in alphabetical order.
package assignment.treeSetExample;

import java.util.Scanner;
import java.util.TreeSet;

public class SortingAlphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> names = new TreeSet<>();

        System.out.print("How many names you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + count + " names:");
        for (int i = 0; i < count; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("\nNames in Alphabetical Order:");
        System.out.println(names);
    }
}
