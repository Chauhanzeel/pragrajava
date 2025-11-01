package CustomException.example;

public class InvalidEmailLengthException extends RuntimeException{
    public InvalidEmailLengthException(String message) {
        super(message);
    }
}
