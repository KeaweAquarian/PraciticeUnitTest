package MockTest;

import DummyTest.DummyEmailService;
import com.keawe.practiceUnitTest.Book;
import com.keawe.practiceUnitTest.BookService;
import com.keawe.practiceUnitTest.EmailService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookServiceTest {
    ///////
    MockFakeBookRepository fakeBookRepository = new MockFakeBookRepository();


    EmailService emailService = new DummyEmailService();
    /////

    BookService bookService = new BookService(fakeBookRepository, emailService);

    Book book1 = new Book(1, "biking", LocalDate.now());
    Book book2 = new Book(2, "biking2", LocalDate.now());

    @Test
    void check() {
        bookService.addBook(book1);
        bookService.addBook(book2);
      fakeBookRepository.varify(2, book2);
    }


}