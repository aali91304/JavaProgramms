package JavaChallenges.LibraryManagement;

public class Magazine extends LibraryItem{
    private String issueNumber;

    Magazine(String itemId, String title, String author,String issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
}
