import org.junit.Before;


public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        book1 = new Book("The Day of the Bomb", "Karl Bruckner", "Fiction" );
        book1 = new Book("The Windup Bird Chronicle", "Haruki Murakami", "Fiction" );
        book1 = new Book("Python", "Some Guy", "Reference" );
        book1 = new Book("Margrave of the Marshes", "John Peel", "Non Fiction" );
        library = new Library();

    }


}
