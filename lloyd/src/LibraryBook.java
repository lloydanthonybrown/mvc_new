public class LibraryBook {
    private int numberOfPages;
    private String title;
    private String yearPublished;
    private boolean isCheckedIn; // Should I use this? Is this the right place? // use this

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public LibraryBook(Integer numberOfPages, String title, String yearPublished, boolean isCheckedIn){
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.yearPublished = yearPublished;
        this.isCheckedIn = isCheckedIn;
    }

    public String getTitle() {
        return title;
    }

    public LibraryBook(){
        // Do I need a default constructor of LibraryBook in order to make an ArrayList of Books initially?
    }

    @Override
    public String toString() {
        return title;
    }
}
