package CustomException;

public class DriveTest {
    public int bookDriveTest(int age){
        if (age < 16) {
            throw new InvalidAgeException("You must be at least 16 years old to book a driving test.");
        } else {
            System.out.println("Age verified. You can book the test!");
            payment();
        }
        return age;
    }

    public void payment(){
        System.out.println("Payment successful! Your driving test has been booked.");

    }
}
