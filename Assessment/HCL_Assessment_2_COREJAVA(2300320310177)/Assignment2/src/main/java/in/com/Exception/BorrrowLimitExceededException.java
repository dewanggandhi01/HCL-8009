package in.com.Exception;

public class BorrrowLimitExceededException extends LibraryException {
    public BorrrowLimitExceededException() {
        super();
    }
    public BorrrowLimitExceededException(String message) {
        super(message);
    }
}
