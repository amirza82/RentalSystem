package com;

import java.sql.Date;

public class Book extends Item {
    private String writer;
    private String publisher;
    private String bookCover;
    

    public Book(String title, String genre, Integer id, Date releaseDate, String writer, String publisher,
            String bookCover, boolean isAvailable) {
        super(title, genre, id, releaseDate, isAvailable);
        this.writer = writer;
        this.publisher = publisher;
        this.bookCover = bookCover;
    }

    public String getWriters() {
        return writer;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public String getBookCover() {
        return bookCover;
    }
}
