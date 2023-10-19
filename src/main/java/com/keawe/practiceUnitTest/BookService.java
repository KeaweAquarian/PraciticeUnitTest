package com.keawe.practiceUnitTest;

public class BookService {
    BookRepository bookRepository;
    EmailService emailService;

    public BookService(BookRepository bookRepository, EmailService emailService) {
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public int numberOfBooks(){
        return bookRepository.allBooks().size();
    }
}
