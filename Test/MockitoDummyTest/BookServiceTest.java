package MockitoDummyTest;

import com.keawe.practiceUnitTest.Book;
import com.keawe.practiceUnitTest.BookRepository;
import com.keawe.practiceUnitTest.BookService;
import com.keawe.practiceUnitTest.EmailService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {
    BookRepository fakeBookRepository = Mockito.mock(BookRepository.class);
    EmailService dummyEmailService = new DummyEmailService();
    BookService bookService = new BookService(fakeBookRepository, dummyEmailService);

    Book book1 = new Book(1, "biking", LocalDate.now());
    Book book2 = new Book(2, "biking2", LocalDate.now());

    @Test
    void addBook() {
        bookService.addBook(book1);
        bookService.addBook(book2);
        Collection<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Mockito.when(fakeBookRepository.allBooks()).thenReturn(books);
        assertEquals(2, bookService.numberOfBooks());

    }

    @Test
    void numberOfBooks() {
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.numberOfBooks();
        assertEquals(2, bookService.numberOfBooks());
    }
}