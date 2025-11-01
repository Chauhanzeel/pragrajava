package oct28;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter numbers:");
        try {
            for (int i = 0; i < 6; i++) { // intentionally going out of bounds
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
//           e.printStackTrace();
        }

        System.out.println("\nYou entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
