package CustomException.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OnlineWebApp onlineWebApp = new OnlineWebApp();

        System.out.println("Enter the email address ");
        String email = scanner.next();

        System.out.println("Enter the userName ");
        String userName = scanner.next();

        System.out.println("Enter the password ");
        String password = scanner.next();

        System.out.println("Enter the Phone Number ");
        String phoneNo = scanner.next();

        //  user 1
        onlineWebApp.ecomApp(email, userName, password,PaymentMethod.CREDIT_CARD,phoneNo);

        // user 2
        onlineWebApp.ecomApp(email, userName, password,PaymentMethod.MASTER_CARD,phoneNo);

        // password, paymentMethod, phoneNumber
        System.out.println("browse more..");
        System.out.println("End of app");

    }
}
