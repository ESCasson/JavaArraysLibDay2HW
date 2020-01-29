import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Library library;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        ArrayList<Book> collection = new ArrayList<Book>();
        book1 = new Book("The Day of the Bomb", "Karl Bruckner", "Fiction" );
        book2 = new Book("The Windup Bird Chronicle", "Haruki Murakami", "Fiction" );
        book3 = new Book("Python", "Some Guy", "Reference" );
        book4 = new Book("Margrave of the Marshes", "John Peel", "Non Fiction" );
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);
        collection.add(book4);

        library = new Library(collection, 5);
    }

    public int countBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void addBook(Library library) {
        Book bookToBorrow = library.removeBookFromBookToLent();
        this.borrowedBooks.add(bookToBorrow);
    }
}

