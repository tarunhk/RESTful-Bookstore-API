package com.example.bookstore.service;

import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Page<Book> getAllBooks(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public Book saveBook(Book book) {
        return repo.save(book);
    }
    public List<Book> getBooksByGenre(String genre) {
        return repo.findByGenre(genre);
    }

    public List<Book> searchBooksByTitle(String title) {
        return repo.findByTitleContaining(title);
    }
}