public class Program9_Scanner {
    import java.util.Scanner;

    public class Program12_Scanner {

        public static void main(String[] args) {

            // Create Scanner reading from keyboard
            Scanner scanner = new Scanner(System.in);

            System.out.println("==============================");
            System.out.println("    STUDENT PROFILE BUILDER   ");
            System.out.println("==============================");

            // Reading a String (no newline issue with nextLine)
            System.out.print("Enter your full name: ");
            String name = scanner.nextLine();

            // Reading an int (GOTCHA: leaves '\n' in buffer)
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Reading a double
            System.out.print("Enter your CGPA (e.g. 7.5): ");
            double cgpa = scanner.nextDouble();

            // CRITICAL: consume leftover '\n' from after nextDouble()
            scanner.nextLine();

            // Now nextLine() works correctly
            System.out.print("Enter your branch: ");
            String branch = scanner.nextLine();

            System.out.print("Enter your college name: ");
            String college = scanner.nextLine();

            // =============================================
            // DISPLAY AND PROCESS THE INPUT
            // =============================================
            System.out.println();
            System.out.println("==============================");
            System.out.println("       YOUR PROFILE           ");
            System.out.println("==============================");
            System.out.println("Name:    " + name);
            System.out.println("Age:     " + age);
            System.out.printf("CGPA:    %.2f%n", cgpa);
            System.out.println("Branch:  " + branch);
            System.out.println("College: " + college);

            // Derive performance level from CGPA
            String performance;
            if      (cgpa >= 9.0) performance = "Outstanding";
            else if (cgpa >= 8.0) performance = "Excellent";
            else if (cgpa >= 7.0) performance = "Good";
            else if (cgpa >= 6.0) performance = "Average";
            else                   performance = "Needs Improvement";

            System.out.println("Status:  " + performance);

            // Placement eligibility
            boolean eligible = cgpa >= 7.0 && age >= 18;
            System.out.println("Placement Eligible: " + (eligible ? "YES" : "NO"));

            // =============================================
            // SIMPLE CALCULATOR WITH SCANNER
            // =============================================
            System.out.println("\n==============================");
            System.out.println("      SIMPLE CALCULATOR       ");
            System.out.println("==============================");

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            scanner.nextLine(); // consume newline

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.nextLine().trim();

            double calcResult;
            boolean validOperation = true;

            switch (operator) {
                case "+" -> calcResult = num1 + num2;
                case "-" -> calcResult = num1 - num2;
                case "*" -> calcResult = num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("ERROR: Cannot divide by zero!");
                        calcResult = 0;
                        validOperation = false;
                    } else {
                        calcResult = num1 / num2;
                    }
                }
                default -> {
                    System.out.println("ERROR: Unknown operator '" + operator + "'");
                    calcResult = 0;
                    validOperation = false;
                }
            }

            if (validOperation) {
                System.out.printf("%.2f %s %.2f = %.4f%n", num1, operator, num2, calcResult);
            }

            scanner.close();
        }
    }
}
