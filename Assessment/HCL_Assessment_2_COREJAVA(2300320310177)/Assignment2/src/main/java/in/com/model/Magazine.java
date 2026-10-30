package in.com.model;

import in.com.Exception.ItemNotAvailableException;
import java.util.Date;

public class Magazine extends LibraryItem {
    private int issueNumber;
    final int lateFee = 1;

    public Magazine(String title, Date year, boolean available) {
        super(title, year, available);
    }

    public Magazine(String title, int issueNumber, Date year, boolean available) {
        super(title, year, available);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public double lateFeee(int dayslate) {
        return lateFee * dayslate;
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            setAvailable(false);
        } else {
            throw new ItemNotAvailableException("Magazine is not available for borrowing");
        }
    }

    @Override
    public void giveFeedback(String feedback) {
        feedBacks.add(feedback);
    }

    @Override
    public String toString() {
        return "Magazine{title='" + getTitle() + "', issueNumber=" + issueNumber + ", available=" + isAvailable() + "}";
    }
}
