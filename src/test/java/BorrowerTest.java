import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book1 = new Book("The Lord of the Rings", "J. R. R. Tolkein", "Fantasy");
        book2 = new Book("Frankenstein", "Mary Shelley", "Horror");
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBookToBorrowerCollection(){
        borrower.addBook(book1);
        assertEquals(1, borrower.bookCount());
    }


}
