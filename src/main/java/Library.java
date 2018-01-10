import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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


    public HashMap<String, Integer> getGenreCount(){
        HashMap<String, Integer> genreCount = new HashMap<String,Integer>();
        for(Book book: this.collection){
            Integer count = genreCount.get(book.getGenre());
            if (count == null){
                count = 0;
            }
            count += 1;
            genreCount.put(book.getGenre(), count);
        }
        return genreCount;
    }

}