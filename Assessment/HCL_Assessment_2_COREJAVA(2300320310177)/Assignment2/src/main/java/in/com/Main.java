package in.com;

import in.com.Exception.ItemNotAvailableException;
import in.com.model.Book;
import in.com.model.Dvd;
import in.com.model.Magazine;
import in.com.model.Member;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System (Assessment 2) ===");

        // Create Member
        Member member = new Member(101, "Shivansh", "shivansh@example.com");
        System.out.println("Created: " + member);

        // Create items
        Book book = new Book("Effective Java", "Joshua Bloch", "978-0134685991", new Date(), true);
        Dvd dvd = new Dvd("Inception Movie", 148);
        Magazine magazine = new Magazine("Java Magazine", 42, new Date(), true);

        System.out.println("Available items:");
        System.out.println("1. " + book);
        System.out.println("2. " + dvd);
        System.out.println("3. " + magazine);

        // Borrow items
        System.out.println("\n--- Borrowing Items ---");
        member.borrowItem(book);
        System.out.println("Borrowed book: " + book.getTitle());
        System.out.println("Book available now? " + book.isAvailable());

        // Test feedback
        book.giveFeedback("Excellent reference book!");
        System.out.println("Book Feedbacks: " + book.getFeedBacks());

        // Test late fee calculation
        int overdueDays = 3;
        System.out.println("Late fee for Book (" + overdueDays + " days): Rs." + book.lateFeee(overdueDays));
        System.out.println("Late fee for DVD (" + overdueDays + " days): Rs." + dvd.lateFeee(overdueDays));
        System.out.println("Late fee for Magazine (" + overdueDays + " days): Rs." + magazine.lateFeee(overdueDays));

        // Test ItemNotAvailableException
        System.out.println("\n--- Testing Exception Handling ---");
        try {
            System.out.println("Attempting to borrow the same book again...");
            member.borrowItem(book);
        } catch (ItemNotAvailableException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        System.out.println("\nMember status: " + member);
        System.out.println("All operations completed successfully!");
    }
}
