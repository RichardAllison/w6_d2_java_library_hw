import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;
    Book book2;

    @Before
    public void before(){
        book1 = new Book("The Lord of the Rings", "J. R. R. Tolkein", "Fantasy");
        book2 = new Book("Frankenstein", "Mary Shelley", "Horror");
    }

    @Test
    public void bookHasName(){
        assertEquals("The Lord of the Rings", book1.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Mary Shelley", book2.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book1.getGenre());
    }
}
