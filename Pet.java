
/**
 * Write a description of class Pet here.
 *
 * A. Starr
 * 11/1/17
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private int collarNum;
    private boolean alive;
    public static int numPets;

    /**
     * Constructor for objects of class Pet
     */
    public Pet()
    {
        // initialise instance variables
    }
    
    public Pet (int num, String nm, boolean al) {
        this.collarNum = num;
        this.name = nm;
        this.alive = al;
        numPets++;
    }
    
    public static void example() {
        System.out.println("This is static!");
    }
    
    public Pet newPet(Pet other) {
        Pet temp = new Pet(other.collarNum, this.name, this.alive);
        return temp;
    }
    
    public int getCollar() {
        return this.collarNum;
    }
    
    public void setAlive(boolean al) {
        this.alive = al;
    }
    
    public String toString() {
        return "The pet's name is: " + this.name;
    }
    
}