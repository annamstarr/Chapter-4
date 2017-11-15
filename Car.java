public class Car {
    private String model;
    private int year;
    
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
