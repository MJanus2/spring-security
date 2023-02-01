package com.mjanus.practice.repository;

import com.mjanus.practice.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();
    void save(Book book);
    void deleteByIndex(int index);

}