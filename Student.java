import java.util.Scanner;

// Unit 2, Topic 2.1, Classes and Objects, 11/03/21


public class Student {
    // these are INSTANCE VARIABLES.
    private int studentID;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;


    // Creating a Constructor
    public Student() {
        this.studentID = 0:
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
        this.studentID =
    }












































    public static void main(String[] args) {
        Student student0 = new Student();
        Student student1 = new Student(12345678, 11, 0.57 "Dr. Strange");

        System.out.println("Hello there!");
        threeline();
        System.out.println("General Kenobi");
        calcGPA();
    }