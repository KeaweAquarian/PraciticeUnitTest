package com.keawe.practiceUnitTest;

import java.util.Collection;
import java.util.Map;

public interface BookRepository {
    void save(Book book);

    Collection<Book> allBooks();
}
