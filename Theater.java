public class Theater {
    private Seat[][] seats;

    // Constructor: initialize all seats as unreserved
    public Theater(int rows, int cols) {
        seats = new Seat[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                seats[r][c] = new Seat();
            }
        }
    }
    // Setter - reserves a seat in given row, col.

    public void reserveSeat(int row, int col) {
        seats[row][col].reserve();
}
    // Part (a): Count total reserved seats in the theater
    public int countReservedSeats() {
       
    }

    // Part (b): Toggle all seats in a given row (reserve -> unreserve, unreserve -> reserve)
    public void toggleRow(int row) {
   
    }

    // Part (c): Check if there are n consecutive empty seats in a row
    public boolean hasNBlankSeats(int row, int n) {
    

    }

    // Print theater for testing (R = reserved, O = open)
    public void printTheater() {
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[0].length; c++) {
                if (seats[r][c].isReserved()) {
                    System.out.print("R ");
                } else {
            System.out.print("O ");
            }
        }
        System.out.println(); // move to next row
        }
    }
}