import com.keawe.practiceUnitTest.Book;
import com.keawe.practiceUnitTest.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {
    Map<Integer, Book> map = new HashMap<>();
    @Override
    public void save(Book book) {
        map.put(book.getId(), book);
    }

    @Override
    public Collection<Book> allBooks() {
        return map.values();
    }
}
