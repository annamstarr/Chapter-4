public class Author
{
    private String name;
    private int age;

    public Author(String nm, int yr) {
        this.age = yr;
        this.name = nm;
    }
    public String toString() {
        return this.name + " who is " + this.age + " years old.";
    }

}
