import java.util.Scanner;

public class Program10_WeekIntegration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║   STUDENT MARKS ANALYZER v1.0        ║");
        System.out.println("╚══════════════════════════════════════╝");

        // Get student info
        System.out.print("\nStudent name: ");
        String studentName = scanner.nextLine();

        System.out.print("Number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Validate input
        if (numSubjects <= 0 || numSubjects > 20) {
            System.out.println("Invalid number of subjects. Must be between 1 and 20.");
            scanner.close();
            return;  // exit main method early
        }

        // Array to store marks (we'll learn arrays deeply next week)
        double[] marks = new double[numSubjects];
        String[] subjects = new String[numSubjects];

        scanner.nextLine(); // consume newline after nextInt()

        // Collect marks for each subject
        System.out.println("\nEnter subject name and marks:");
        double totalMarks = 0;
        int passCount = 0;
        int failCount = 0;
        final double PASSING_MARKS = 35.0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " name: ");
            subjects[i] = scanner.nextLine().trim();

            System.out.print("Marks for " + subjects[i] + " (0-100): ");
            marks[i] = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            // Validate marks range
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Setting to 0.");
                marks[i] = 0;
            }

            totalMarks += marks[i];
            if (marks[i] >= PASSING_MARKS) {
                passCount++;
            } else {
                failCount++;
            }
        }

        // Calculate statistics
        double average = totalMarks / numSubjects;
        double maxMarks = marks[0];
        double minMarks = marks[0];
        String topSubject = subjects[0];
        String weakSubject = subjects[0];

        for (int i = 1; i < numSubjects; i++) {
            if (marks[i] > maxMarks) {
                maxMarks = marks[i];
                topSubject = subjects[i];
            }
            if (marks[i] < minMarks) {
                minMarks = marks[i];
                weakSubject = subjects[i];
            }
        }

        // Determine grade
        String grade;
        String remark;
        if (average >= 90)      { grade = "A+"; remark = "Outstanding performance!"; }
        else if (average >= 80) { grade = "A";  remark = "Excellent work!"; }
        else if (average >= 70) { grade = "B";  remark = "Good performance."; }
        else if (average >= 60) { grade = "C";  remark = "Average. Room to improve."; }
        else if (average >= 35) { grade = "D";  remark = "Passed, but significant improvement needed."; }
        else                    { grade = "F";  remark = "Failed. Please seek academic support."; }

        boolean allPassed = failCount == 0;

        // Display report
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║         PERFORMANCE REPORT            ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("Student: " + studentName.toUpperCase());
        System.out.println("Subjects: " + numSubjects);
        System.out.println();

        // Subject-wise breakdown
        System.out.println("--- Subject-wise Results ---");
        for (int i = 0; i < numSubjects; i++) {
            String status = (marks[i] >= PASSING_MARKS) ? "PASS" : "FAIL";
            System.out.printf("  %-20s : %6.2f  [%s]%n", subjects[i], marks[i], status);
        }

        System.out.println();
        System.out.println("--- Summary ---");
        System.out.printf("Total Marks:  %.2f / %.0f%n", totalMarks, numSubjects * 100.0);
        System.out.printf("Average:      %.2f%%  (Grade: %s)%n", average, grade);
        System.out.printf("Highest:      %.2f  (%s)%n", maxMarks, topSubject);
        System.out.printf("Lowest:       %.2f  (%s)%n", minMarks, weakSubject);
        System.out.println("Passed:       " + passCount + "/" + numSubjects + " subjects");

        System.out.println();
        System.out.println("--- Verdict ---");
        if (allPassed) {
            System.out.println("RESULT: PASSED ✓");
        } else {
            System.out.println("RESULT: FAILED ✗ (" + failCount + " subject(s) below passing marks)");
        }
        System.out.println("Remark: " + remark);

        System.out.println();
        System.out.println("--- Improvement Areas ---");
        System.out.println("Subjects below 60% (needs attention):");
        boolean anyBelow60 = false;
        for (int i = 0; i < numSubjects; i++) {
            if (marks[i] < 60) {
                System.out.printf("  → %s: %.2f%n", subjects[i], marks[i]);
                anyBelow60 = true;
            }
        }
        if (!anyBelow60) {
            System.out.println("  None! All subjects above 60%.");
        }

        scanner.close();
    }
}