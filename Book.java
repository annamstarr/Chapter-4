public class Book
{
    private Author bookAuthor;
    private String title;

    public Book(Author a, String tl) {
        this.bookAuthor = a;
        this.title =tl;
    }
    public String toString() {
        return "The author of " + this.title + " is " + this.bookAuthor;
    }

}
