package in.com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class LibraryItem implements Borrowable {
    private static int idCounter = 1;
    private int id;
    private String title;
    private Date year;
    private boolean available;
    protected List<String> feedBacks;

    public LibraryItem(String title, Date year, boolean available) {
        this.id = idCounter++;
        this.title = title;
        this.year = year;
        this.available = available;
        this.feedBacks = new ArrayList<>();
    }

    public LibraryItem() {
        this.id = idCounter++;
        this.available = true;
        this.feedBacks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<String> getFeedBacks() {
        return feedBacks;
    }

    public abstract double lateFeee(int dayslate);

    public abstract void giveFeedback(String feedback);
}
