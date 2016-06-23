public class LibraryView {
    private LibraryController libraryController;

    public LibraryView(){
        this.libraryController = new LibraryController();
    }

    public static void main(String[] args) {
        LibraryView mainLibraryView = new LibraryView();

        System.out.println("We currently have " + mainLibraryView.libraryController.getBookCount() + " books in the library.");
        System.out.println("We currently have these books checked in at the library: " + mainLibraryView.libraryController.getBooks());


    }

//    public checkOutBook()
}