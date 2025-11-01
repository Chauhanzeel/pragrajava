package CustomException.example;

public class invalidPhoneNoLengthException extends RuntimeException {
    public invalidPhoneNoLengthException(String message){
        super(message);
    }
}
