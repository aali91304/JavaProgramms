package JavaChallenges;


//LIBRARY MANAGEMENT SYSTEM
public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static  int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    public  void borrowBook(){
        if(isBorrowed){
            System.out.println(" book is already borrowed.1;");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book");

        }

    }
    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println(" enjoy your day:");
        }else{
            System.out.println("This book is already in the library.");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("1","Design","Akhtar");
        Book mybook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        book.borrowBook();
        mybook.borrowBook();
        book.borrowBook();
        book.returnBook();;
        book.returnBook();;

    }
}
