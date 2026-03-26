package com.example.bookstore.controller;

import com.example.bookstore.entity.Book;
import com.example.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Book> getAllBooks(Pageable pageable) {
        return service.getAllBooks(pageable);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.saveBook(book);
    }
    @GetMapping("/genre")
    public List<Book> getBooksByGenre(@RequestParam String genre) {
        return service.getBooksByGenre(genre);
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title) {
        return service.searchBooksByTitle(title);
    }
}