public class Lab32 {
    public static void main(String[] args) {
        Theater theater = new Theater(5, 6);

        theater.reserveSeat(0, 0);
        theater.reserveSeat(0,1);
        theater.reserveSeat(2, 3);
        theater.reserveSeat(4, 5);
        
        // Initial theater
        System.out.println("Initial theater:");
        theater.printTheater();

        // Reserve some seats manually
        theater.toggleRow(0); // toggle entire row 0
        theater.toggleRow(2); // toggle entire row 2

        System.out.println("\nTheater after toggling rows 0 and 2:");
        theater.printTheater();

        // Count reserved seats
        int totalReserved = theater.countReservedSeats();
        System.out.println("\nTotal reserved seats: " + totalReserved);

        // Check for 3 consecutive empty seats in row 1
        boolean has3Open = theater.hasNBlankSeats(1, 3);
        System.out.println("Row 1 has 3 consecutive empty seats? " + has3Open);

        // Check for 4 consecutive empty seats in row 0
        boolean has4Open = theater.hasNBlankSeats(0, 4);
        System.out.println("Row 0 has 4 consecutive empty seats? " + has4Open);

         // Check for 2 consecutive empty seats in row 0
        boolean has2Open = theater.hasNBlankSeats(0, 2);
        System.out.println("Row 0 has 2 consecutive empty seats? " + has2Open);

    }
}