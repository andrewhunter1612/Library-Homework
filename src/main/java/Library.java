import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private HashMap<String, Integer> bookGenres;

    public Library() {
        books = new ArrayList<>();
        bookGenres = new HashMap<>();
    }

    public int getAllBooks() {
        return this.books.size();
    }

    public void addNewBook(Book book) {
        this.books.add(book);
    }

    public boolean checkIfBookInStock(Book book) {
        return this.books.contains(book);
    }



    public void sortByGenres() {
        for (int i = 0; i < getAllBooks(); i++) {
            if (this.bookGenres.containsKey(this.books.get(i).getGenre())){
                int value = this.bookGenres.get(this.books.get(i).getGenre()) ;
                value++;
                this.bookGenres.put(this.books.get(i).getGenre(), value);
            } else {
                this.bookGenres.put(this.books.get(i).getGenre(), 1);
            }
        }
    }


    public Book removeBook(Book book) {
        return this.books.remove(books.indexOf(book));
    }
}
