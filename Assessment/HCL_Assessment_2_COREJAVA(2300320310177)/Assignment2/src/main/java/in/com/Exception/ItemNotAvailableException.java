package in.com.Exception;

public class ItemNotAvailableException extends LibraryException {
    public ItemNotAvailableException() {
        super();
    }
    public ItemNotAvailableException(String message) {
        super(message);
    }
}
