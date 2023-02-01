package com.mjanus.practice.controller;

import com.mjanus.practice.mapper.BookMapper;
import com.mjanus.practice.model.BookDto;
import com.mjanus.practice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
class BookController {

    private final BookService service;

    @GetMapping
    public List<BookDto> getBooks() {
        return BookMapper.toBookDtoList(service.getBooks());
    }

    @PostMapping
    public void createBook(@RequestBody BookDto bookDto) {
        service.createBook(BookMapper.toBook(bookDto));
    }

    @DeleteMapping(path = "/{index}")
    public void deleteBook(@PathVariable("index") int index) {
        service.deleteBook(index);
    }
}