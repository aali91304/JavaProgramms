package JavaChallenges.LibraryManagement;

public class DVD extends LibraryItem{
    private  double durationinHr;

    DVD(String itemId, String title, String author,double durationinHr) {
        super(itemId, title, author);
        this.durationinHr = durationinHr;
    }

    public double getDurationinHr() {
        return durationinHr;
    }

    public void setDurationinHr(double durationinHr) {
        this.durationinHr = durationinHr;
    }
}
