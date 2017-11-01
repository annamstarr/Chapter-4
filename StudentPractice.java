/**
 * Write a description of class Student here.
 *
 * A. Starr
 * 11/1/17
 */
public class StudentPractice
{
    // instance variables - replace the example below with your own
    private String name;
    private int idNumber;
    private StudentPractice bestFriend;
    
    /**
     * Constructor for objects of class Student
     */
    public StudentPractice()
    {
        // initialise instance variables
    }
    public StudentPractice (int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public int combineIDNumbers() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public StudentPractice newStudentPractice(StudentPractice other) {
        StudentPractice temp = new StudentPractice(other.idNumber, this.name);
        return temp;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public String toString() {
        return "The student's name is: " + this.name;
    }

}
