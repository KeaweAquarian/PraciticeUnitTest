package SpyTest;

import DummyTest.DummyEmailService;
import DummyTest.FakeBookRepository;
import com.keawe.practiceUnitTest.Book;
import com.keawe.practiceUnitTest.BookRepository;
import com.keawe.practiceUnitTest.BookService;
import com.keawe.practiceUnitTest.EmailService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookServiceTest {
    ///////
    SpyFakeBookRepository fakeBookRepository = new SpyFakeBookRepository();


    EmailService emailService = new DummyEmailService();
    /////

    BookService bookService = new BookService(fakeBookRepository, emailService);

    Book book1 = new Book(1, "biking", LocalDate.now());
    Book book2 = new Book(2, "biking2", LocalDate.now());

    @Test
    void addBook() {

    }

    @Test
    void numberOfBooks() {
        bookService.addBook(book1);
        assertEquals(1, fakeBookRepository.numberSaved );
        bookService.addBook(book2);
        bookService.numberOfBooks();
        assertTrue(book2.equals(fakeBookRepository.lastCalled));
    }
}