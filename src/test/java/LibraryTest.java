import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Lord of the Rings", "J. R. R. Tolkein", "Fantasy");
        book2 = new Book("Frankenstein", "Mary Shelley", "Horror");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void canAddBookToCollection(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        library.addBook(book2);
        Book removed = library.removeBook();
        assertNotNull(removed);
        assertEquals(0, library.bookCount());
    }

}
