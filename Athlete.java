public class Athlete {
    private String name;
    private int age;

    public Athlete(String nm, int yr) {
        this.name = nm;
        this.age = yr;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public String toString() {
        return "This athlete is named " + this.name  + " and is " + this.age + " years old \n";
    }
    
    public boolean equals(Athlete other) {
        if(this.name.equals(other.name) && this.age == other.age) {
            return true;
        }
        else {
            return false;
        }
    }

}
