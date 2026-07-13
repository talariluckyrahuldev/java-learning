public class Program03_Operators {

    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        System.out.println("=== ARITHMETIC OPERATORS ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();
        System.out.println("Addition:        " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction:     " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication:  " + a + " * " + b + " = " + (a * b));
        System.out.println("Division (int):  " + a + " / " + b + " = " + (a / b));
        System.out.println("Modulo:          " + a + " % " + b + " = " + (a % b));
        System.out.println("Division (double): " + a + " / " + b + " = " + ((double) a / b));

        // =============================================
        // THE INTEGER DIVISION TRAP — LEARN THIS NOW
        // =============================================
        System.out.println("\n=== INTEGER DIVISION TRAP ===");
        int students = 7;
        int groups = 2;

        // WRONG way: both int → integer division → truncates decimal
        double wrong = students / groups;
        System.out.println("WRONG:   students / groups = " + wrong);
        // Prints 3.0, not 3.5! Because 7/2 = 3 (integer) → stored as 3.0 in double

        // RIGHT way: cast one to double BEFORE dividing
        double correct = (double) students / groups;
        System.out.println("CORRECT: (double)students / groups = " + correct);
        // Prints 3.5 — correct

        // =============================================
        // MODULO IN PRACTICE
        // =============================================
        System.out.println("\n=== MODULO OPERATOR IN PRACTICE ===");
        int number = 17;
        System.out.println("Is " + number + " even? " + (number % 2 == 0));  // false
        System.out.println("Is " + number + " odd?  " + (number % 2 != 0));  // true

        int total = 157;
        int perGroup = 10;
        int fullGroups = total / perGroup;
        int leftover = total % perGroup;
        System.out.println("\n" + total + " students in groups of " + perGroup + ":");
        System.out.println("Full groups: " + fullGroups);
        System.out.println("Leftover:    " + leftover);

        // =============================================
        // COMPOUND ASSIGNMENT OPERATORS
        // =============================================
        System.out.println("\n=== COMPOUND ASSIGNMENT ===");
        int score = 100;
        System.out.println("Start: score = " + score);
        score += 15;    System.out.println("score += 15  →  " + score);
        score -= 8;     System.out.println("score -= 8   →  " + score);
        score *= 2;     System.out.println("score *= 2   →  " + score);
        score /= 3;     System.out.println("score /= 3   →  " + score);
        score %= 50;    System.out.println("score %= 50  →  " + score);

        // =============================================
        // INCREMENT AND DECREMENT
        // =============================================
        System.out.println("\n=== INCREMENT / DECREMENT ===");
        int counter = 10;
        System.out.println("counter starts at: " + counter);
        counter++;
        System.out.println("counter++ gives:   " + counter);
        counter--;
        System.out.println("counter-- gives:   " + counter);

        // Post-increment vs Pre-increment (subtle but important)
        int x = 5;
        System.out.println("\nPost-increment (x++): prints " + x++ + " THEN increments");
        System.out.println("After post-increment: x = " + x);

        int y = 5;
        System.out.println("\nPre-increment (++y): increments THEN prints " + ++y);
        System.out.println("After pre-increment: y = " + y);
    }
}