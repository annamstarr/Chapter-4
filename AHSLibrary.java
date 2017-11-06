public class AHSLibrary {
    public static void main(String[] args) {
        Library ahs = new Library(2, "Acalanes");

        Author a = new Author("Shakespeare", 23);
        Book b = new Book(a,"Hamlet");
        ahs.addBook(b, 0);
        
        Author c = new Author("Jim", 24);
        Book d = new Book(c, "Why I Love Pam");
        ahs.addBook(d, 1);
        
        System.out.println(ahs);
    }
}
