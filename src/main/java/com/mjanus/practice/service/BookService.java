package com.mjanus.practice.service;

import com.mjanus.practice.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    void createBook(Book book);
    void deleteBook(int index);
}