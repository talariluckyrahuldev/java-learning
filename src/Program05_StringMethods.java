public class Program05_StringMethods {

    public static void main(String[] args) {

        String raw = "  Rahul Kumar  ";   // note the leading and trailing spaces
        String email = "Rahul@Example.COM";
        String sentence = "Java is a powerful programming language";
        String csv = "Apple,Banana,Mango,Papaya,Orange";

        // =============================================
        // LENGTH AND TRIMMING
        // =============================================
        System.out.println("=== LENGTH AND TRIM ===");
        System.out.println("Original: \"" + raw + "\"");
        System.out.println("Length (with spaces): " + raw.length());       // 15
        System.out.println("Trimmed: \"" + raw.trim() + "\"");
        System.out.println("Trimmed length: " + raw.trim().length());      // 11

        // =============================================
        // CASE CONVERSION
        // =============================================
        System.out.println("\n=== CASE CONVERSION ===");
        System.out.println("Original: " + email);
        System.out.println("Lower:    " + email.toLowerCase());
        System.out.println("Upper:    " + email.toUpperCase());

        // =============================================
        // SEARCHING
        // =============================================
        System.out.println("\n=== SEARCHING ===");
        System.out.println("Sentence: " + sentence);
        System.out.println("contains('Java'):        " + sentence.contains("Javascript"));
        System.out.println("contains('Python'):      " + sentence.contains("Python"));
        System.out.println("startsWith('Java'):      " + sentence.startsWith("Java"));
        System.out.println("endsWith('language'):    " + sentence.endsWith("language"));
        System.out.println("indexOf('powerful'):     " + sentence.indexOf("powerful"));
        System.out.println("indexOf('Python'):       " + sentence.indexOf("Python"));
        // indexOf returns -1 when substring not found — useful for existence checks

        // =============================================
        // EXTRACTING
        // =============================================
        System.out.println("\n=== EXTRACTING ===");
        System.out.println("charAt(0):           " + sentence.charAt(0));
        System.out.println("substring(8):        " + sentence.substring(8));
        System.out.println("substring(8, 17):    " + sentence.substring(8, 17));
        // substring(start, end): includes start, EXCLUDES end

        // =============================================
        // REPLACING AND SPLITTING
        // =============================================
        System.out.println("\n=== REPLACE AND SPLIT ===");
        System.out.println("Replace 'Java' with 'Python': " + sentence.replace("Java", "Python"));
        System.out.println("Replace 'a' with '@': " + sentence.replace("a", "@"));

        System.out.println("\nCSV: " + csv);
        String[] fruits = csv.split(",");
        System.out.println("After split(','):");
        for (String fruit : fruits) {
            System.out.println("  → " + fruit);
        }
        System.out.println("Number of fruits: " + fruits.length);

        // =============================================
        // STRING EQUALITY — THE MOST IMPORTANT SECTION
        // =============================================
        System.out.println("\n=== STRING EQUALITY (CRITICAL) ===");
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("s1 = \"" + s1 + "\", s2 = \"" + s2 + "\", s3 = new String(\"hello\")");
        System.out.println();
        System.out.println("s1 == s2:           " + (s1 == s2));
        // true: both reference same object in String constant pool (JVM optimization)

        System.out.println("s1 == s3:           " + (s1 == s3));
        // false: s3 is a NEW object on the heap — different memory address

        System.out.println("s1.equals(s2):      " + s1.equals(s2));
        System.out.println("s1.equals(s3):      " + s1.equals(s3));
        // both true: .equals() compares CONTENT, not memory address

        System.out.println();
        System.out.println("RULE: ALWAYS use .equals() to compare Strings. NEVER use ==");
        System.out.println("SAFER: \"hello\".equals(variable) — avoids NullPointerException");

        // =============================================
        // PRACTICAL: SIMPLE EMAIL VALIDATION
        // =============================================
        System.out.println("\n=== SIMPLE EMAIL VALIDATION ===");
        String[] testEmails = {"user@example.com", "invalidemail", "another@test", "@nodomain.com"};

        for (String testEmail : testEmails) {
            boolean hasAtSign = testEmail.contains("@");
            boolean hasDot = testEmail.contains(".");
            boolean atNotFirst = !testEmail.startsWith("@");
            boolean dotAfterAt = testEmail.indexOf(".") > testEmail.indexOf("@");

            boolean isValid = hasAtSign && hasDot && atNotFirst && dotAfterAt;
            System.out.printf("%-25s → %s%n", testEmail, isValid ? "VALID" : "INVALID");
        }
        System.out.println("(This is basic validation. Real email validation uses regex — covered in Week 3)");
    }
}