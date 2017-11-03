// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String studentName;
    private double score1;
    private double score2;
    private double average;
    
    //constructor
    Scanner scan = new Scanner(System.in);
    
    public Student(String nm) {
        this.studentName = nm;
    }
    
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    public void inputGrades() {
        //add body of inputGrades
        System.out.print("Enter " + studentName + "'s score on Test 1: \t");
        this.score1 = scan.nextFloat();
        
        System.out.print("Enter " + studentName + "'s score on Test 2: \t");
        this.score2 = scan.nextFloat();
    }
    
    //getAverage: compute and return the student's test average
    public double getAverage() {
        //add body of getAverage
        this.average = ((this.score1 + this.score2) / 2);
        return this.average;
    }
    
    //getName: return the student's name
    public String getName() {
        //add body of getName
        return this.studentName;
    }

    //printName: print the student's name
    public String toString(){
        //add body of printName
        return "Name: " + this.studentName + "\tScore 1: " + this.score1 + "\tScore 2: " + this.score2;
    }
}