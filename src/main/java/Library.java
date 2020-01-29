import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private Integer capacity;
    private ArrayList<Book> bookToBeLent;
    private Integer indexNum;

    public Library(ArrayList<Book> collection, Integer capacity) {
        this.collection = collection;
        this.capacity = capacity;
        this.bookToBeLent = new ArrayList<Book>();
        this.indexNum = -1;
    }

    public int getIndex(){
        return this.indexNum;
    }

    public Book getBookToBeLent(){
        return this.bookToBeLent.get(0);
    }


    public int countBooks() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book) {
        if (this.capacity > countBooks()) {
            this.collection.add(book);
        }
    }

    public void addBookToBookToBeLent(String bookTitle) {
        Book theBook = null;
        for (Book book : this.collection) {
            if (book.getTitle() == bookTitle) {
               this.bookToBeLent.add(book);
                this.indexNum = this.collection.indexOf(book);
            }
        }
    }



    public boolean isBookInLibraryByTitle(String bookTitle) {
        for (Book book : this.collection) {
            if (book.getTitle() == bookTitle) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(){
        Integer index = getIndex();
        this.collection.remove(index);
    }


    public int countBookToBeLent() {
        return this.bookToBeLent.size();
    }

    public Book removeBookFromBookToLent() {
        return this.bookToBeLent.remove(0);
    }
}
