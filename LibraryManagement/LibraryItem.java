package JavaChallenges.LibraryManagement;

public class LibraryItem {
    private String itemId;
    private  String title;
    private String author;
    private boolean checkedOut;

     LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkout() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Item checked out.");
        } else {
            System.out.println("Item is already checked out.");
        }
    }

    public void returnItem() {

        if (checkedOut) {
            checkedOut = false;
            System.out.println("Item returned.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }
}
