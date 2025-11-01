package CustomException.example;

public class invalidPasswordLengthException extends RuntimeException{
     public invalidPasswordLengthException(String message) {
            super(message);
        }
}

