import java.util.ArrayList;
import java.util.Collection;

public class LibraryModel {
    private ArrayList checkedInBooks = new ArrayList();

    public ArrayList getCheckedInBooks() {
        return checkedInBooks;
    }

    public void setCheckedInBooks(ArrayList checkedInBooks) {
        this.checkedInBooks = checkedInBooks;
    }

    public LibraryModel(LibraryBook book1,LibraryBook book2,LibraryBook book3,LibraryBook book4,LibraryBook book5 ){

    }

    public LibraryBook checkOutBook(LibraryBook book){
        // if checkedInBooks.contains(book)?
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

    public Collection getBooks(){
        return checkedInBooks;
    }

}
