package CustomException.example;

public class OnlineWebApp {

    public void register(String email, String password,String phoneNo) throws InvalidEmailLengthException {
        if(email.length() < 5){
            throw new InvalidEmailLengthException("invalid email exception");
        }
        if(password.length() < 6){
            throw new invalidPasswordLengthException("Invalid Password Exception");
        }
        if(phoneNo.length() < 10){
            throw new invalidPhoneNoLengthException("Invalid Phone No");
        }
    }

    public void emailConfirmation(String email,String password, String phoneNo) throws InvalidEmailLengthException {
        register(email,password,phoneNo);
        System.out.println("Email notification Sent");
    }

    public void login(String email, String userName,String password, String phoneNo, PaymentMethod paymentMethod)
            throws InvalidEmailLengthException, InvalidCredentialsException {
        if(userName.equals(email)){
            throw new InvalidCredentialsException("Invalid Username");
        }
        emailConfirmation(email,password,phoneNo);
        System.out.println("User is able to login");
    }

    public void shop(String email, String userName,String password, String phoneNo, PaymentMethod paymentMethod)
            throws InvalidEmailLengthException {
        login(email, userName,password,phoneNo,paymentMethod);
        System.out.println("Find item to shop and checkout");
    }

    public void payment(String email, String userName, String password,PaymentMethod paymentMethod, String phoneNo)
            throws InvalidEmailLengthException,InvalidPaymentMethodException {
        shop(email, userName,password,phoneNo,paymentMethod);
        System.out.println("Choose your payment method");
        if(paymentMethod.equals(PaymentMethod.PAYPAL)){
            System.out.println("Payment Method Payed");
        } else {
            System.out.println("You can select only this payment method");
            throw  new InvalidPaymentMethodException("Invalid Payment Method");
        }
    }

    public void ecomApp(String email, String userName,String password, PaymentMethod paymentMethod, String phoneNo) {
        try {
            payment(email, userName,password, paymentMethod,phoneNo);
        }catch (InvalidEmailLengthException e){
            e.printStackTrace();
        }
    }
}
