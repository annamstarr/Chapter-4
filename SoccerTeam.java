public class SoccerTeam {
    public static void main(String[] args) {
        Team acalanes = new Team("Acalanes Soccer", 10);
        Athlete sam = new Athlete("Sam", 17);
        acalanes.addAthlete(sam,0);
        sam.setAge(23);
        
        Athlete jill = new Athlete("Sam", 23);
        acalanes.addAthlete(jill,1);
        System.out.println(sam.equals(jill));   //will print true because name and age are same
        
        System.out.println(acalanes);
    }
}
