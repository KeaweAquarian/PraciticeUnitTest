import com.keawe.practiceUnitTest.Book;
import com.keawe.practiceUnitTest.BookRepository;
import com.keawe.practiceUnitTest.BookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    BookRepository fakeBookRepository = new FakeBookRepository();
    BookService bookService = new BookService(fakeBookRepository);

    Book book1 = new Book(1, "biking", LocalDate.now());
    Book book2 = new Book(2, "biking2", LocalDate.now());

    @Test
    void addBook() {

    }

    @Test
    void numberOfBooks() {
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.numberOfBooks();
        assertEquals(2, bookService.numberOfBooks());
    }
}