public class Program04_TypeCasting {

    public static void main(String[] args) {

        // =============================================
        // IMPLICIT CASTING — smaller type → larger type (automatic)
        // byte → short → int → long → float → double
        // =============================================
        System.out.println("=== IMPLICIT CASTING (widening, automatic) ===");

        int myInt = 9;
        double myDouble = myInt;  // int automatically becomes double — no cast needed
        System.out.println("int:    " + myInt);
        System.out.println("double: " + myDouble);  // prints 9.0

        long myLong = myInt;      // int → long also automatic
        System.out.println("long:   " + myLong);    // prints 9

        // =============================================
        // EXPLICIT CASTING — larger type → smaller type (manual, risk of data loss)
        // =============================================
        System.out.println("\n=== EXPLICIT CASTING (narrowing, manual) ===");

        double price = 99.99;
        int priceInt = (int) price;  // TRUNCATES — cuts off decimal part (does NOT round)
        System.out.println("double: " + price);
        System.out.println("int:    " + priceInt + "  ← decimal TRUNCATED, not rounded");

        double temperature = -7.8;
        int tempInt = (int) temperature;
        System.out.println("\ndouble: " + temperature);
        System.out.println("int:    " + tempInt + "  ← truncated toward zero");
        // Note: -7.8 truncates to -7 (not -8)

        // =============================================
        // THE CRITICAL AVERAGE TRAP (most common in LeetCode)
        // =============================================
        System.out.println("\n=== THE AVERAGE TRAP ===");

        int totalMarks = 251;
        int subjects = 3;

        // TRAP: integer / integer = integer (decimal lost BEFORE assignment)
        double wrongAverage = totalMarks / subjects;
        System.out.println("WRONG: " + totalMarks + " / " + subjects + " = " + wrongAverage);
        // Prints 83.0 instead of 83.666...

        // CORRECT: cast numerator to double first
        double correctAverage = (double) totalMarks / subjects;
        System.out.printf("CORRECT: (double)%d / %d = %.2f%n", totalMarks, subjects, correctAverage);
        // Prints 83.67

        // =============================================
        // STRING ↔ NUMBER CONVERSION
        // =============================================
        System.out.println("\n=== STRING TO NUMBER ===");

        String ageStr = "20";
        String gpaStr = "8.75";
        String priceStr = "1499.99";

        int age = Integer.parseInt(ageStr);         // String → int
        double gpa = Double.parseDouble(gpaStr);    // String → double
        double itemPrice = Double.parseDouble(priceStr);

        System.out.println("\"20\" as int:     " + age);
        System.out.println("\"8.75\" as double: " + gpa);
        System.out.println("\"1499.99\" as double: " + itemPrice);
        System.out.println("Sum: " + (age + gpa));

        System.out.println("\n=== NUMBER TO STRING ===");

        int year = 2026;
        double piValue = 3.14159;

        String yearStr = String.valueOf(year);
        String piStr = String.valueOf(piValue);
        String combined = "Year: " + year;  // concatenation also converts

        System.out.println("int 2026 as String: \"" + yearStr + "\"");
        System.out.println("double as String: \"" + piStr + "\"");
        System.out.println("Concatenation: \"" + combined + "\"");

        // =============================================
        // WHAT HAPPENS WITH INVALID PARSING
        // =============================================
        // Integer.parseInt("abc") would throw NumberFormatException
        // We handle this with try-catch (covered in Week 2)
        // For now, just know: only parse strings that are valid numbers
        System.out.println("\n(Note: parsing non-numeric strings throws NumberFormatException)");
        System.out.println("(We cover exception handling in Week 2)");
    }
}