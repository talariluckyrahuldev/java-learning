public class Program8_ForLoop {
    public class Program10_ForLoop {

        public static void main(String[] args) {

            // =============================================
            // BASIC FOR LOOP
            // =============================================
            System.out.println("=== BASIC FOR LOOP ===");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Iteration " + i);
            }

            // =============================================
            // COUNTING DOWN
            // =============================================
            System.out.println("\n=== COUNTDOWN ===");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println("\n🚀 Launch!");

            // =============================================
            // STEPPING BY MORE THAN 1
            // =============================================
            System.out.println("\n=== EVEN NUMBERS 0–20 ===");
            for (int i = 0; i <= 20; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();

            // =============================================
            // SUM USING LOOP
            // =============================================
            System.out.println("\n=== SUM OF 1 TO 100 ===");
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;  // sum = sum + i
            }
            System.out.println("1 + 2 + 3 + ... + 100 = " + sum);
            // Verify: Gauss formula = n*(n+1)/2 = 100*101/2 = 5050

            // =============================================
            // MULTIPLICATION TABLE WITH PRINTF ALIGNMENT
            // =============================================
            System.out.println("\n=== MULTIPLICATION TABLE FOR 7 ===");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("7 × %2d = %3d%n", i, 7 * i);
                // %2d = integer padded to width 2 (aligns single-digit numbers)
                // %3d = integer padded to width 3
            }

            // =============================================
            // NESTED LOOPS: MULTIPLICATION TABLE (all 1–5)
            // =============================================
            System.out.println("\n=== FULL MULTIPLICATION TABLE (1–5) ===");
            // Print header row
            System.out.print("   ");
            for (int col = 1; col <= 5; col++) {
                System.out.printf("%4d", col);
            }
            System.out.println();
            System.out.println("   " + "----".repeat(5));

            // Print table body
            for (int row = 1; row <= 5; row++) {
                System.out.printf("%2d |", row);
                for (int col = 1; col <= 5; col++) {
                    System.out.printf("%4d", row * col);
                }
                System.out.println();
            }

            // =============================================
            // BREAK AND CONTINUE
            // =============================================
            System.out.println("\n=== BREAK — exits loop early ===");
            System.out.print("Numbers until first multiple of 7: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 7 == 0) {
                    System.out.println("\nFound it! " + i + " is divisible by 7. Breaking.");
                    break;
                }
                System.out.print(i + " ");
            }

            System.out.println("\n=== CONTINUE — skips iteration ===");
            System.out.print("Numbers 1–20, skipping multiples of 3: ");
            for (int i = 1; i <= 20; i++) {
                if (i % 3 == 0) continue;  // skip this iteration
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
