import java.util.Scanner;
import java.util.Arrays;
public class Program14_ArrayFundamentals {
    public static void main(String[] args){
        System.out.println("====ARRAY DECLARATION====");
        int[] zeroes = new int[10];
        System.out.println("new int[5] default values: ");
        //Method 1:new keyword with size
        for(int i = 0;i<zeroes.length;i++){
            System.out.println(zeroes[i] + " ");
        }
        System.out.println();

        //Method 2:array literal
        int[] scores = {85,90,78,92,88,76};
        System.out.println("Scores array" + Arrays.toString(scores));
        System.out.println("Length: " + scores.length);


        //ACCESSING ELEMENTS
        System.out.println("====Access====");
        System.out.println("First element" + scores[0]);
        System.out.println("Last element" + scores[scores.length-1]);
        System.out.println("Middle element" + scores[scores.length/2]);

        //Modifying the elements
        System.out.println("====Modifying Elements====");
        System.out.println("Before " + Arrays.toString(scores) );
        scores[2] = 100;
        System.out.println("After " + Arrays.toString(scores) );
        // THREE WAYS TO TRAVERSE
        // =============================================
        System.out.println("\n=== TRAVERSAL METHODS ===");

        // Way 1: Traditional for (need index value)
        System.out.println("--- Traditional for (with index) ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("  scores[" + i + "] = " + scores[i]);
        }

        // Way 2: Enhanced for (only need value)
        System.out.println("--- Enhanced for (value only) ---");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // Way 3: While
        System.out.println("--- While loop ---");
        int index = 0;
        while (index < scores.length) {
            System.out.print(scores[index] + " ");
            index++;
        }
        System.out.println();

        // =============================================
        // ARRAYS.TOSTRING — PRINT ARRAY EASILY
        // =============================================
        System.out.println("\n=== Arrays.toString() ===");
        double[] prices = {9.99, 14.50, 2.99, 7.25};
        String[] names = {"Rahul", "Priya", "Amit", "Sneha"};
        boolean[] flags = {true, false, true, true};

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Names:  " + Arrays.toString(names));
        System.out.println("Flags:  " + Arrays.toString(flags));

        // =============================================
        // REFERENCE TYPE DEMONSTRATION
        // =============================================
        System.out.println("\n=== ARRAY REFERENCE BEHAVIOR ===");
        int[] original = {1, 2, 3, 4, 5};
        int[] alias = original;       // alias points to SAME array
        int[] copy = Arrays.copyOf(original, original.length);  // true copy

        alias[0] = 999;

        System.out.println("original after alias[0]=999:  " + Arrays.toString(original));
        // Prints [999, 2, 3, 4, 5] — original was changed through alias!

        System.out.println("alias:                        " + Arrays.toString(alias));
        // Prints [999, 2, 3, 4, 5] — same array

        System.out.println("copy (independent):           " + Arrays.toString(copy));
        // Prints [1, 2, 3, 4, 5] — copy is unaffected

        System.out.println("LESSON: Assignment copies the reference, not the values.");
        System.out.println("Use Arrays.copyOf() for an independent copy.");
    }

}
