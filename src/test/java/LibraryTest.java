import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;
    private Library library2;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Borrower bob;

    @Before
    public void before(){
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
        library2 = new Library(collection, 4);

        bob = new Borrower("bob");

    }

    @Test
        public void canCountBooksInCollection(){
        assertEquals(4, this.library.countBooks());
    }

    @Test
    public void canAddBookToCollection(){
        book5 = new Book("The Master and Margarita", "Mikhail Bulgakov", "Fiction");
        library.addBookToCollection(book5);
        assertEquals(5, this.library.countBooks());
    }

    @Test
    public void canNotAddBookToCollectionDueToCapacity(){
        book5 = new Book("The Master and Margarita", "Mikhail Bulgakov", "Fiction");
        library2.addBookToCollection(book5);
        assertEquals(4, this.library2.countBooks());
    }

    @Test
    public void confirmiBookInLibrary() {
        String bookTitle = "The Day of the Bomb";
        assertEquals(true, library.isBookInLibraryByTitle(bookTitle));
    }

    @Test
    public void confirmiBookNotInLibrary() {
        String bookTitle = "The Day of the IceCream";
        assertEquals(false, library.isBookInLibraryByTitle(bookTitle));
    }




    @Test
    public void removeBookbyIndex(){
        library.addBookToBookToBeLent("The Day of the Bomb");
        library.removeBook();
        assertEquals(1, library.countBookToBeLent());
        //assertEquals(3, library.countBooks());

    }

    @Test
    public void canRemoveBookFromBookToLend(){
        library.addBookToBookToBeLent("The Day of the Bomb");
        library.removeBookFromBookToLent();
        assertEquals(0, library.countBookToBeLent());
    }





}
