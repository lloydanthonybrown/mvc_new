import java.util.ArrayList;

public class LibraryView {
    private LibraryController libraryController;

    public LibraryView(){
        this.libraryController = new LibraryController();
    }

    public static void main(String[] args) {
        LibraryView mainLibraryView = new LibraryView();
        ArrayList showAllBooks = mainLibraryView.libraryController.getBooks();

        System.out.println("We currently have " + mainLibraryView.libraryController.getBookCount() + " books in the library.");

        // Do a for loop here to go through my books and display them in a pretty way.
        System.out.println("The books in the library are: ");
        for (int i=0; i < showAllBooks.size(); i++) {
            System.out.println(showAllBooks.get(i));
        }

        System.out.println("Another view: " + mainLibraryView.libraryController.getBooks());

        // check out a book
        // print out the checked in books to verify that it was successfully removed from the list of books checked in.
        // check in a book
        // print out the checked in books to verify that it was successfully checked in.
    }

//    public checkOutBook(}
}