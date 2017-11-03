
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String model;
    private int year;
    
    /**
     * Constructor for objects of class Car
     */
    public Car(String md, int yr) {
        this.model = md;
        this.year = yr;
    }
    public String toString() {
        return "This is a " + model + " built in " + year;
    }
    
    public boolean equals(Car otherCar) {
        if (this.model.equals(otherCar.model) && this.year == otherCar.year) {
            return true;
        }
        else {
            return false;
        }
    }

}
