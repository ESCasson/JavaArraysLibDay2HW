import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower bob;
    private Book book1;
    private Library library;

    @Before
    public void before(){
        bob = new Borrower("Bob");
        book1 = new Book("The Day of the Bomb", "Karl Bruckner", "Fiction" );
    }


    @Test
    public void borrowedBooksArrayStartsEmpty(){
        assertEquals(0, bob.countBorrowedBooks());
    }

    @Test
    public void canAddBook(){
        library.addBookToBookToBeLent("The Day of the Bomb");
        System.out.println(library.getBookToBeLent());
        bob.addBook(library);
        assertEquals(1, bob.countBorrowedBooks());
    }
}
