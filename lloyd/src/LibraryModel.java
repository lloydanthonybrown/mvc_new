import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LibraryModel {
    private ArrayList checkedInBooks = new ArrayList();

    // getter for checkedInBooks attribute (is that the same thing as a property?)
    public ArrayList getCheckedInBooks() {
        return checkedInBooks;
    }

    public Collection getBooks(){
        return checkedInBooks;
    }

    // Do I need something like this?
    public ArrayList getBookTitles(){
        return checkedInBooks;
    }

    // default constructor
    public LibraryModel(LibraryBook... setOfBooks){
        Collections.addAll(checkedInBooks, setOfBooks);
    }

    public LibraryBook checkOutBook(LibraryBook book){
        if(book.isCheckedIn()) {
            checkedInBooks.remove(book);
            book.setCheckedIn(false);
        } else {
            System.out.println("That book is already checked out, and is not available.");
        }
        return book;
    }

    public LibraryBook returnBook(LibraryBook book){
        if (book.isCheckedIn()) {
            System.out.println("This book is already checked in. You cannot check in the same book twice. ");
        } else {
            checkedInBooks.add(book);
            book.setCheckedIn(true);
        }
        return book;
    }


}
