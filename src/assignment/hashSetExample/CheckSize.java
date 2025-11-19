//Check the size before and after removing elements.
package assignment.hashSetExample;

import java.util.HashSet;
import java.util.Scanner;

public class CheckSize {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Zeel");
        names.add("Vinit");
        names.add("Aarav");
        names.add("Aman");

        System.out.println("Size before removal: " + names.size());
        System.out.println("HashSet: " + names);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name that you want to remove: ");
        String removeElement = sc.nextLine();

        names.remove(removeElement);

        System.out.println("Size after removal: " + names.size());
        System.out.println("HashSet: " + names);
    }
}
