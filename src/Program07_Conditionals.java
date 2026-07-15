public class Program07_Conditionals {
    public static void main(String[] args){
        System.out.println("=====GRADE CALCULATOR=====");
        int marks = 78;
        System.out.println("marks = " + marks);
        String grade;
        if(marks >= 90){
            grade = "A";
        }else if(marks >= 80){
            grade = "B";
        }else if(marks >= 70){
            grade = "C";
        }else if(marks>=60){
            grade = "D";
        }else {
            grade = "F(FAIL)";
        }
        System.out.println("Grade is: " + grade);

        System.out.println("======Logical Operator in Conditionals=====");
        int age = 21;
        double cgpa = 7.8;
        boolean hasActiveBacklog = false;
        int attendancePercent = 82;
        if(age>=18 && cgpa>=7.0 && !hasActiveBacklog && attendancePercent >= 75 ){
            System.out.println("Eligible for Campus PLACEMENT");
        }else{
            System.out.println("Not Eligible for Campus PLACEMENT");
        }

        System.out.println("======Loan Eligibility======");
        double monthlyIncome = 45000;
        double existingEMI = 5000;
        int creditScore = 720;
        double requestedLoan = 500000;

        if (creditScore >= 700) {
            if (monthlyIncome >= 30000) {
                double maxEMI = monthlyIncome * 0.4;  // 40% of income rule
                double newEMI = requestedLoan / 60;   // 5-year loan

                if ((existingEMI + newEMI) <= maxEMI) {
                    System.out.println("LOAN APPROVED");
                    System.out.printf("Requested: ₹%.0f%n", requestedLoan);
                    System.out.printf("Monthly EMI: ₹%.2f%n", newEMI);
                } else {
                    System.out.println("LOAN REJECTED: Total EMI would exceed 40% of income");
                    System.out.printf("Max allowed EMI: ₹%.2f%n", maxEMI);
                    System.out.printf("Proposed EMI: ₹%.2f%n", existingEMI + newEMI);
                }
            } else {
                System.out.println("LOAN REJECTED: Minimum income requirement not met (₹30,000)");
            }
        } else {
            System.out.println("LOAN REJECTED: Credit score too low (minimum 700)");
            System.out.println("Your score: " + creditScore);
        }


        System.out.println("======TERNARY OPERATOR======");
        int score = 65;
        String result = (score >= 50) ? "PASS" : "FAIL";
        System.out.println("Result is: " + result);
        int a = 34 , b =78;
        int max = ( a > b ) ? a : b;
        int min = ( a < b ) ? a : b;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        //NESTED TERNARY
        int num = 0;
        String sign = (num>0) ?"Positive" : (num<0) ? "negative" : "zero";
        System.out.println("Sign: " + sign);




    }
}
