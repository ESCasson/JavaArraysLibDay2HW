import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Test
    public void canGetTitle(){
        book = new Book("The Day of the Bomb", "that guy", "Fiction");
        assertEquals("The Day of the Bomb", book.getTitle());
    }
}
