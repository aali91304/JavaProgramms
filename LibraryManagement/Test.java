package JavaChallenges.LibraryManagement;

public class Test {
    public static void main(String[] args) {
        LibraryItem lt = new LibraryItem("A01","GODAN","PremChand");
        Book book = new Book("B01","SuperConscious","OSHO","97881to0104");
        Magazine magazine = new Magazine("C01","ChankyNiti","Chankya","C01-101");
        DVD dvd = new DVD("AV01","Avengers","Stan_Lee",2.15);
        lt.checkout();
        lt.returnItem();
        book.checkout();
        book.returnItem();
        System.out.println();
        System.out.println("All the methods and classes are running successfully !");

    }
}
