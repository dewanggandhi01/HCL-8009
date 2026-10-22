package in.com.model;

import in.com.Exception.ItemNotAvailableException;

public class Dvd extends LibraryItem {
    int durationMinutes;
    final int latefee = 5;

    public Dvd(int durationMinutes) {
        super();
        this.durationMinutes = durationMinutes;
    }

    public Dvd(String title, int durationMinutes) {
        super();
        setTitle(title);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
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
            throw new ItemNotAvailableException("DVD is not available for borrowing");
        }
    }

    @Override
    public void giveFeedback(String feedback) {
        feedBacks.add(feedback);
    }

    @Override
    public String toString() {
        return "Dvd{title='" + getTitle() + "', duration=" + durationMinutes + " mins, available=" + isAvailable() + "}";
    }
}
