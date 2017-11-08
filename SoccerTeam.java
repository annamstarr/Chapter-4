public class SoccerTeam {
    public static void main(String[] args) {
        Team acalanes = new Team("Acalanes Soccer", 20);
        Athlete sam = new Athlete("Sam", 17);
        acalanes.addAthlete(sam,0);
        sam.setAge(23);
        
        acalanes.addAthlete(sam, 1);
        System.out.println(acalanes);
        Athlete jill = new Athlete("Sam", 23);
        System.out.println(sam.equals(jill));
        System.out.println(jill.equals(sam));
    }
}
