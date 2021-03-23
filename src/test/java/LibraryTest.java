import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {
    private Library library;
    private Borrower borrower;
    private Book book, book2, book1;


    @Before
    public void before(){
        library = new Library();
        borrower = new Borrower();
        book = new Book("Booky Wook", "Dave", "Horror");
        book1 = new Book("This", "Fred", "AcCom");
        book2 = new Book("Rocky", "Steve", "Thriller");

    }

    @Test
    public void addNewBook(){
        library.addNewBook(book);
        library.addNewBook(book1);
        library.addNewBook(book2);
        assertEquals(3, library.getAllBooks());
    }

    @Test
    public void checkIfBookInStock(){
        library.addNewBook(book);
        library.addNewBook(book1);
        library.addNewBook(book2);
        assertTrue(library.checkIfBookInStock(book));
    }

    @Test
    public void removeBook(){
        library.addNewBook(book);
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.removeBook(book);
        assertEquals(2, library.getAllBooks());
    }

    @Test
    public void borrowerTakesBook(){
        library.addNewBook(book);
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.sortByGenres();

        borrower.addBook(book);
        library.removeBook(book);

        assertEquals(1, borrower.getAllBooks());
        assertEquals(2, library.getAllBooks());
    }

}
