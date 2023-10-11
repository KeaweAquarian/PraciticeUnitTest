package com.keawe.practiceUnitTest;

import java.time.LocalDate;

public class Book {
    int id;
    String bookName;
    LocalDate published;

    public Book(int id, String bookName, LocalDate published) {
        this.id = id;
        this.bookName = bookName;
        this.published = published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }
}
