public class Team {
    private String teamName;
    private Athlete[] players;

    public Team(String nm, int size) {
        this.teamName = nm;
        this.players = new Athlete[size];
    }
    public void addAthlete(Athlete a, int index) {
        players[index] = a;
    }
    public String toString() {
        String output = "The team players for " + this.teamName + ":\n";
        for (Athlete a : players) {
            output += a + "\n";
        }
        return output;
    }
}
