package CustomException.example;

public class InvalidPaymentMethodException extends RuntimeException{
    public InvalidPaymentMethodException(String message){
        super(message);
    }
}
