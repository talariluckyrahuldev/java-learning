public class Program18_MatrixOperations {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b ={{9,8,7},{6,5,4},{3,2,1}};

        //Martrix Addition
        System.out.println("===Matrix Addition(A+B)===");
        System.out.println("Matrix A:" );
        printMatrix(a);
        System.out.println("Matrix B:");
        printMatrix(b);

        int[][] sum = new int[a.length][a[0].length];
        for(int row = 0;row<a.length;row++){
            for(int cols = 0;cols<a[0].length;cols++){
                sum[row][cols]=a[row][cols] + b[row][cols];
            }
        }
        System.out.println("A+B");
        printMatrix(sum);

        System.out.println("===Matrix Transpose===");
        int rows = a.length;
        int cols = a[0].length;
        int[][] transpose = new int[rows][cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                transpose[col][row] = a[row][col];
            }
        }
        printMatrix(transpose);
        printMatrix(a);

        //row sum
        int[][]data ={{5,10,15},{20,25,30},{35,40,45}};
        printMatrix(data);
        System.out.println("\nRow sums:");
        for(int row=0;row<data.length;row++){
            int sumRow = 0;
            for(int col=0;col<data[0].length;col++){
                sumRow+=data[row][col];

            }
        }
        //coloumn sum
        System.out.println("Coloumn sum");
        for(int col=0;col<data[0].length;col++){
            int sumCol = 0;
            for(int row=0;row<data.length;row++){
                sumCol+=data[row][col];
            }
        }
        System.out.println("\n=== CLASSROOM SEATING (5 rows × 4 cols) ===");
        String[][] seats = new String[5][4];

        // Fill seats with student names (null = empty seat)
        seats[0][0] = "Rahul";  seats[0][1] = "Priya";
        seats[0][2] = "Amit";   seats[0][3] = "Sneha";
        seats[1][0] = "Vijay";  seats[1][2] = "Kavya";
        seats[2][1] = "Ravi";   seats[2][3] = "Meena";
        // Other seats remain null

        // Print seating plan
        System.out.println("\nSeating Plan:");
        System.out.println("        Seat 1   Seat 2   Seat 3   Seat 4");
        for (int row = 0; row < seats.length; row++) {
            System.out.printf("Row %d:  ", row + 1);
            for (int col = 0; col < seats[row].length; col++) {
                String occupant = (seats[row][col] != null) ? seats[row][col] : "(empty)";
                System.out.printf("%-9s", occupant);
            }
            System.out.println();
        }

        // Count occupied vs empty seats
        int occupied = 0, empty = 0;
        for (String[] row : seats) {
            for (String seat : row) {
                if (seat != null) occupied++;
                else empty++;
            }
        }
        System.out.println("\nOccupied: " + occupied + " | Empty: " + empty);
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }






    }
}
