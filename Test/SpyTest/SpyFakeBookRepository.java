package SpyTest;

import com.keawe.practiceUnitTest.Book;
import com.keawe.practiceUnitTest.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SpyFakeBookRepository implements BookRepository {
    Map<Integer, Book> map = new HashMap<>();
    public int numberSaved = 0;
    public Book lastCalled;
    @Override
    public void save(Book book) {

        map.put(book.getId(), book);
        numberSaved++;
        lastCalled = book;
    }

    @Override
    public Collection<Book> allBooks() {
        return map.values();
    }
}
