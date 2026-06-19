public class Program01_Variables {
    public static void main(String[] args) {
        //1.INTEGER-whole number
        int age =20;
        int year = 2026;
        int negativeTemp = -5;//Camel CASE

        //2.DOUBLE
        double gpa = 8.5;
        double height = 5.5;
        double pi = 3.14159;

        //3.BOOLEAN
        boolean isStudent = true;
        boolean hasJob = false;
        boolean isAbove18 = true;

        //4.CHAR
        char grade = 'A'; //must be enclosed with single quotes
        char firstInitial = 'R';
        char symbol = '@';

        //5.STRING - text
        String name = "rahul";
        String college = "Tier 3 Engineering College";
        String branch = "ECE";

        //PRINT ALL VARIABLES
        //=======================================
        //=========MY ENTIRE PROFILE=============
        //=======================================
        System.out.println("name  " + name );
        System.out.println("age " + age);
        System.out.println("year " + year);
        System.out.println("GPA " + age);
        System.out.println("height " + height + "ft");
        System.out.println("College " + college);
        System.out.println("Initial " + firstInitial);
        System.out.println("Student " + isStudent);
        System.out.println("HAS JOB " +"hasJob");
        System.out.println("PI " + pi);

        //Variable Reassignment
        System.out.println("---Update age---");
        System.out.println("Before age" + age);
        age = 21;
        System.out.println("After age" + age);

        //Arithmetic with variables
        System.out.println("-----Quick Math-----");
        int marks1 = 78;
        int marks2 = 92;
        int marks3 = 56;
        int total = marks1 + marks2 + marks3;
        double average = total / 3;
        System.out.println("Subject 1: " + marks1);
        System.out.println("Subject 2: " + marks2);
        System.out.println("Subject 3: " + marks3);
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);



    }


}
