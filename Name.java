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
        return firstName;
    }
    public String getMiddle() {
        return middleName;
    }
    public String getLast() {
        return lastName;
    }
    public String firstMiddleLast() {
        return firstName + " " + middleName + " " + lastName;
    }
    public String lastFirstMiddle() {
        return lastName + ", " + firstName + " " + middleName;
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
