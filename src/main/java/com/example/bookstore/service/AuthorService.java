package com.example.bookstore.service;

import com.example.bookstore.entity.Author;
import com.example.bookstore.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repo;

    public AuthorService(AuthorRepository repo) {
        this.repo = repo;
    }

    public List<Author> getAllAuthors() {
        return repo.findAll();
    }

    public Author saveAuthor(Author author) {
        return repo.save(author);
    }
}