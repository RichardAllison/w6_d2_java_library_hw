import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;


    public Library() {
        this.collection = new ArrayList<>();
    }


    public int bookCount() {
        return this.collection.size();
    }
}