package in.com.model;

public interface Borrowable {
    boolean isAvailable();
    void borrow();
    void giveFeedback(String feedback);

}
