public class Seat {
    private boolean reserved;

    // Constructor
    public Seat() {
        this.reserved = false; // all seats start unreserved
    }

    // Check if seat is reserved
    public boolean isReserved() {
        return reserved;
    }

    // Reserve the seat
    public void reserve() {
        reserved = true;
    }

    // Cancel reservation
    public void cancel() {
        reserved = false;
    }

    // Toggle reservation
    public void toggle() {
        reserved = !reserved;
    }
}