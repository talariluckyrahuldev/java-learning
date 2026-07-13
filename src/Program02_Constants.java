public class Program02_Constants {
    public static void main(String[] args){
        //CONSTANTS - values that cannot Change
        //USE 'final' keyword + UPPER_SNAKE_CASE name
        final double PI = 3.14159;
        final int MAX_CLASS_SIZE = 60;
        final double PASSING_PERCENTAGE = 35.0;
        final String UNIVERSITY_NAME = "Anna University";

        System.out.println("===CONSTANTS===");
        System.out.println("PI:" + PI);
        System.out.println("MAX_CLASS_SIZE: " + MAX_CLASS_SIZE);
        System.out.println("PASSING_PERCENTAGE: " + PASSING_PERCENTAGE);
        System.out.println("UNIVERSITY_NAME: " + UNIVERSITY_NAME);


        //PI = 3.0;

        //NAMING CONVENTIONS
        System.out.println("===NAMING CONVENTIONS====");

        //Variable: camelCase(first lower second capital)
        int studentAge = 21;
        double semesterGpa = 8.0;
        String firstName = "Rahul";
        boolean isPassedExam = true;

        //Classes: PascalCase (every word Capitalized)
        //This class is named Program02_Constants
        //Constants: UPPER_SNAKE_CASE(all caps,words seperated '_')
        System.out.println("Student Age(camelCase): " + studentAge);
        System.out.println("Semester GPA: " + semesterGpa);
        System.out.println("First Name: " + firstName);
        System.out.println("isPassedExam: " + isPassedExam);
        System.out.println("MAX_CLASS_SIZE(UPPER_CASE): " + MAX_CLASS_SIZE);

        //CIRCLE AREA CALCULATION
        System.out.println("======CIRCLE AREA ========");
        double radius = 7.0;
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
        System.out.printf("Area(formatted to 2 decimal points): %.2f sq cm%n",area);



    }
}
