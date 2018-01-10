import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;
    Book book8;
    Book book9;
    Book book10;


    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("The Lord of the Rings", "J. R. R. Tolkein", "Fantasy");
        book2 = new Book("Frankenstein", "Mary Shelley", "Horror");
        book3 = new Book("book", "author", "Horror");
        book4 = new Book("book", "author", "Fantasy");
        book5 = new Book("book", "author", "Sci-Fi");
        book6 = new Book("book", "author", "Sci-Fi");
        book7 = new Book("book", "author", "Sci-Fi");
        book8 = new Book("book", "author", "Romance");
        book9 = new Book("book", "author", "Horror");
        book10 = new Book("book", "author", "Horror");

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
    public void canRemoveBookFromCollection(){
        library.addBook(book2);
        Book removed = library.removeBook();
        assertNotNull(removed);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryIsFull(){
        for(int i = 0; i < 10; i++){
            library.addBook(book2);
        }
        assertTrue(library.isFull());
    }

    @Test
    public void cantAddMoreThanCapacity(){
        for(int i = 0; i < 12; i++){
            library.addBook(book2);
        }
        assertEquals(10, library.bookCount());
    }


    @Test
    public void canGetGenreCount(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        System.out.println(library.getGenreCount());
    }


}
