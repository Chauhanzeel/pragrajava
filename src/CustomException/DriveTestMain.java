package CustomException;

import java.util.Scanner;

public class DriveTestMain {
    public static void main(String[] args) {
        DriveTest driveTest = new DriveTest();
        System.out.println("Welcome to DriverExaminer App!");

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age for booking the drive test:");
            int age = sc.nextInt();
            driveTest.bookDriveTest(age);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
