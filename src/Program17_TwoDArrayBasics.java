import java.util.Arrays;

public class Program17_TwoDArrayBasics {

    public static void main(String[] args) {

        // =============================================
        // DECLARATION AND INITIALIZATION
        // =============================================
        System.out.println("=== 2D ARRAY DECLARATION ===");

        // Method 1: new keyword
        int[][] grid = new int[3][4];  // 3 rows, 4 columns, all zeros
        System.out.println("new int[3][4] rows: " + grid.length);
        System.out.println("new int[3][4] cols: " + grid[0].length);

        // Method 2: array literal
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nMatrix rows: " + matrix.length);
        System.out.println("Matrix cols: " + matrix[0].length);

        // =============================================
        // ACCESSING ELEMENTS
        // =============================================
        System.out.println("\n=== ACCESSING ELEMENTS ===");
        System.out.println("matrix[0][0] (top-left):     " + matrix[0][0]);
        System.out.println("matrix[0][2] (top-right):    " + matrix[0][2]);
        System.out.println("matrix[2][0] (bottom-left):  " + matrix[2][0]);
        System.out.println("matrix[2][2] (bottom-right): " + matrix[2][2]);
        System.out.println("matrix[1][1] (center):       " + matrix[1][1]);

        // =============================================
        // PRINTING A MATRIX — FORMATTED
        // =============================================
        System.out.println("\n=== PRINTING MATRIX ===");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%3d", matrix[row][col]);
            }
            System.out.println();
        }

        // =============================================
        // MODIFYING ELEMENTS
        // =============================================
        System.out.println("\n=== MODIFYING ELEMENTS ===");
        System.out.println("Before modification:");
        printMatrix(matrix);

        matrix[1][1] = 99;   // change center element
        matrix[0][0] = 10;   // change top-left
        System.out.println("\nAfter matrix[1][1]=99 and matrix[0][0]=10:");
        printMatrix(matrix);

        // Reset for next sections
        matrix[1][1] = 5;
        matrix[0][0] = 1;

        // =============================================
        // FILLING A 2D ARRAY WITH VALUES
        // =============================================
        System.out.println("\n=== FILLING A 3x3 IDENTITY MATRIX ===");
        // Identity matrix: 1s on diagonal, 0s everywhere else
        int[][] identity = new int[3][3];
        for (int row = 0; row < identity.length; row++) {
            for (int col = 0; col < identity[row].length; col++) {
                identity[row][col] = (row == col) ? 1 : 0;
            }
        }
        printMatrix(identity);

        // =============================================
        // JAGGED ARRAY
        // =============================================
        System.out.println("\n=== JAGGED ARRAY (rows with different column counts) ===");
        int[][] jagged = new int[4][];
        jagged[0] = new int[]{1};
        jagged[1] = new int[]{2, 3};
        jagged[2] = new int[]{4, 5, 6};
        jagged[3] = new int[]{7, 8, 9, 10};

        for (int row = 0; row < jagged.length; row++) {
            System.out.printf("Row %d (length %d): %s%n",
                    row, jagged[row].length, Arrays.toString(jagged[row]));
        }
    }

    // Helper method to print matrix nicely
    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}