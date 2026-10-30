package Exception;

public class InvalidAgeException extends Throwable {
    public InvalidAgeException(String underAge) {
        System.out.println(underAge);
    }
}
