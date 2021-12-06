import java.util.Scanner;

// Unit 2, Topic 2.1, Classes and Objects, 12/06/21, 8:34 AM v7.0


public class Student {
    // these are INSTANCE VARIABLES.
    private int studentID;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;


    // Creating a Constructor
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0.0;
        this.studentName = "";
    }

    // Value Constructor
    public Student(int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = GPA;
        this.studentName = studentName;
    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAvg = 4.0;
    }

    //Creating Methods

    public static void calcGPA() {
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;


        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the first grade?");
        grade0 = myScanner.nextInt();
        System.out.println("What is the second grade?");
        grade1 = myScanner.nextInt();
        System.out.println("What is the third grade?");
        grade2 = myScanner.nextInt();
        System.out.println("What is the fourth grade?");
        grade3 = myScanner.nextInt();

        newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
        System.out.print("The new GPA is");
        System.out.println(newGPA);
    }

    //Parameters and arguments
    public static void assignlunch(int gradeLevel) {
        String lunchPeriod;

        if (gradeLevel == 9) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }
    }
    public static void assignlunchmultiple(int gradeLevel, double gradePointAvg) {
        String lunchPeriod; 
        // AND, OR, NOT -- Boolean Operators
        // && = AND
        // || = OR
        // !  = NOT

        if (gradeLevel == 9 || gradePointAvg <= 1.5) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10 && gradePointAvg > 2.0) {
            lunchPeriod = " Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11 && (gradePointAvg != 0.0)) {
            lunchPeriod = " Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = " Off Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }
    }

    public static void mathPractice() {
        int x = 62;
        int y = 28;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type an integer and press enter.\n");
        x = myScanner.nextInt();
        System.out.println("Type an integer and press enter.\n");
        y = myScanner.nextInt();
        System.out.println(Math.min(x, y));

        int lowest;
        lowest = Math.min(x, y);
        System.out.println(lowest);

        System.out.println("Next we will use Math.pow() to calculate.\n");
        System.out.println(Math.pow(x, y));

        double exponents;
        exponents = Math.pow(x, y);
        System.out.println(exponents);

        System.out.println("Next we will use Math.random(). \n");
        System.out.println(Math.random());

        double percentage;
        percentage = (Math.random() * 100);
        System.out.println("There is a");
        System.out.print(percentage);
        System.out.println("% chance of rain today. \n");

        System.out.println("Now we will round a number");

        double numbertoberounded;
        System.out.print("Please enter a double value");
        numbertoberounded = myScanner.nextDouble();
        System.out.print(Math.round(numbertoberounded));
    

    }

    public static double getGPA() {
        int grade0, grade1, grade2;

        grade0 = 75;
        grade1 = 25;
        grade2 = 100;

        double fakeGPA;
        fakeGPA = (grade0 + grade1 + grade2) / 3;

        return fakeGPA;

    }

    public static void main(String[] args) {
        //mathPractice();


        double realGPA;
        realGPA = -1.0;
        System.out.println(realGPA);
        realGPA = getGPA();
        System.out.println(realGPA);


    }
}

    