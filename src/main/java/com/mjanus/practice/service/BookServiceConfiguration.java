package com.mjanus.practice.service;

import com.mjanus.practice.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BookServiceConfiguration {

    @Bean
    BookService bookService(BookRepository repository) {
        return new BookServiceImpl(repository);
    }

}