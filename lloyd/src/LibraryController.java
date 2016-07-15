import java.util.ArrayList;

public class LibraryController {
    private LibraryModel libraryModel;

    // default constructor
    public LibraryController(){
        LibraryBook theWumpWorld = new LibraryBook(48, "The Wump World", "1981", true);
        LibraryBook theCabooseWhoGotLoose = new LibraryBook(48, "The Caboose Who Got Loose", "1980", true);
        LibraryBook theWhingdingdilly = new LibraryBook(64, "The Whingdingdilly", "1982", true);
        LibraryBook howDroofusTheDragonLostHisHead = new LibraryBook(46, "How Droofus the Dragon Lost His Head", "1983", true);
        LibraryBook chesterTheWorldlyPig = new LibraryBook(48, "Chester the Worldly Pig", "1978", true);
        libraryModel = new LibraryModel(theWumpWorld, theCabooseWhoGotLoose, theWhingdingdilly, howDroofusTheDragonLostHisHead, chesterTheWorldlyPig);

    }

    public ArrayList getBooks(){
        return libraryModel.getCheckedInBooks();
    }

    public int getBookCount(){
        return libraryModel.getBooks().size();
    }

//    public ArrayList getBookTitles(){
//        return libraryModel.getBookTitles().title; // I think this is the general idea. How do I return the friggin' titles here?
//        // Is this even on the right track?
//    }

    // Is this the direction I should go when checking books in and out?
    public LibraryBook checkOutBook(LibraryBook book){
        return libraryModel.checkOutBook(book);
    }

    public LibraryBook returnBook(LibraryBook book){
        return libraryModel.returnBook(book);
    }
}
