/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private int idNumber;
    private Student bestFriend;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
    }
    public Student (int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public int combineIDNumbers() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public Student newStudent(Student other) {
        Student temp = new Student(other.idNumber, this.name);
        return temp;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public String toString() {
        return "The student's name is: " + this.name;
    }

}
