public class PetDriver {
    public static void main(String[] args) {
        Pet fluffy = new Pet(1, "Fluffy", true); 
        System.out.println(fluffy);
        fluffy.setAlive(false);
        
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
        Pet sam = new Pet(2, "Sam", true);
        System.out.println(sam);
        System.out.println("Number of pets: " + Pet.numPets);
    }
}