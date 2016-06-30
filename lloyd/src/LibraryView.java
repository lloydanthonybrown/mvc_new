public class LibraryView {
    private LibraryController libraryController;

    public LibraryView(){
        this.libraryController = new LibraryController();
    }

    public static void main(String[] args) {
        LibraryView mainLibraryView = new LibraryView();

        System.out.println("We currently have " + mainLibraryView.libraryController.getBookCount() + " books in the library.");
        // This currently returns the actual objects, rather than the title of those objects. Hmm.
        System.out.println("We currently have these books checked in at the library: " + mainLibraryView.libraryController.getBooks());
        // Do I need a different constructor in my controller to get this to work?
        // This is printing off a reference to my LibraryController. What the crap?
        System.out.println("We currently have these books checked in at the library: " + mainLibraryView.libraryController.toString());

        // check out a book
        // print out the checked in books to verify that it was successfully removed from the list of books checked in.
        // check in a book
        // print out the checked in books to verify that it was successfully checked in.
    }

//    public checkOutBook()
}