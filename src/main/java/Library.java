import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }


    public int bookCount() {
        return this.collection.size();
    }

    public boolean isFull() {
        return (this.capacity == this.collection.size());
    }

    public void addBook(Book book) {
        if (!isFull()) {
            this.collection.add(book);
        }
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }


}