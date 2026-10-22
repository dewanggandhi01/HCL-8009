package in.com.model;

import in.com.Exception.ItemNotAvailableException;
import java.util.Date;

public class Book extends LibraryItem {
    private String author;
    private String isbn;
    final int latefee = 2;

    public Book(String title, Date year, boolean available) {
        super(title, year, available);
    }

    public Book(String title, String author, String isbn, Date year, boolean available) {
        super(title, year, available);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public double lateFeee(int dayslate) {
        return latefee * dayslate;
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            setAvailable(false);
        } else {
            throw new ItemNotAvailableException("Book is not available for borrowing");
        }
    }

    @Override
    public void giveFeedback(String feedback) {
        feedBacks.add(feedback);
    }

    @Override
    public String toString() {
        return "Book{title='" + getTitle() + "', author='" + author + "', available=" + isAvailable() + "}";
    }
}
