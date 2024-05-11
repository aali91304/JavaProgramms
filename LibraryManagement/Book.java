package JavaChallenges.LibraryManagement;

public class Book extends LibraryItem{
    private String ISBN;

    Book(String itemId, String title, String author,String ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
