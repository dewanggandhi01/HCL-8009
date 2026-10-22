package in.com.model;

import in.com.Exception.BorrrowLimitExceededException;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private String email;
    private List<LibraryItem> items;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public void borrowItem(LibraryItem item) {
        if (items.size() >= MAX_BORROW_LIMIT) {
            throw new BorrrowLimitExceededException("Borrow limit of " + MAX_BORROW_LIMIT + " exceeded for member " + name);
        }
        item.borrow();
        items.add(item);
    }

    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "', email='" + email + "', borrowedItems=" + items.size() + "}";
    }
}
