//Given a HashSet of names, check if a specific name exists.
package assignment.hashSetExample;

import java.util.HashSet;
import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Vinit");
        names.add("Khushi");
        names.add("Zeel");
        names.add("Pankaj");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name to check: ");
        String nameToCheck = sc.nextLine();

        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck+"exists in the HashSet");
        }
        else {
            System.out.println(nameToCheck + " does NOT exist in the HashSet.");
        }
    }
}
