public class Name
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName = this.firstName + this.middleName + this.lastName;
    
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    public String getFirst() {
        return this.firstName;
    }
    public String getMiddle() {
        return this.middleName;
    }
    public String getLast() {
        return this.lastName;
    }
    public String firstMiddleLast() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
    public String lastFirstMiddle() {
        return this.lastName + ", " + this.firstName + " " + this.middleName;
    }
    public boolean equals(Name otherName) {
        if (this.fullName.equalsIgnoreCase(otherName.fullName)) {
            return true;
        }
        else {
            return false;
        }
    }
    public String initials() {
        
    }
    public int length() {
        
    }

}
