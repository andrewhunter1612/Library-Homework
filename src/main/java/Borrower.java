import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public int getAllBooks() {
        return this.books.size();
    }
}
