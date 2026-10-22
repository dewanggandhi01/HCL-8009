package in.com.Exception;

public class ItemNotFoundException extends LibraryException {
    public ItemNotFoundException() {
        super();
    }
    public ItemNotFoundException(String message) {
        super(message);
    }
}
