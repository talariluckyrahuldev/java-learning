public class Program19_MultiplicationTable2D {

    public static void main(String[] args) {

        int size = 10;

        // Build the multiplication table as a 2D array
        int[][] table = new int[size + 1][size + 1];

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                table[row][col] = row * col;
            }
        }

        // Print formatted multiplication table
        System.out.println("=== MULTIPLICATION TABLE (1–10) ===\n");

        // Header row
        System.out.print("    |");
        for (int col = 1; col <= size; col++) {
            System.out.printf("%5d", col);
        }
        System.out.println();

        // Separator
        System.out.print("----+");
        System.out.println("-".repeat(size * 5));

        // Data rows
        for (int row = 1; row <= size; row++) {
            System.out.printf("%3d |", row);
            for (int col = 1; col <= size; col++) {
                System.out.printf("%5d", table[row][col]);
            }
            System.out.println();
        }

        // Query specific product
        int r = 7, c = 8;
        System.out.printf("%n%d × %d = %d (looked up from table[%d][%d])%n",
                r, c, table[r][c], r, c);

        // Diagonal elements (where row == col — perfect squares)
        System.out.println("\n=== DIAGONAL (Perfect Squares) ===");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d² = %3d%n", i, table[i][i]);
        }
    }
}