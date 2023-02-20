package com.kodilla.stream.immutable;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPubilcation;

    public Book(String author, String title, int yearOfPubilcation) {
        this.author = author;
        this.title = title;
        this.yearOfPubilcation = yearOfPubilcation;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPubilcation() {
        return yearOfPubilcation;
    }
}

