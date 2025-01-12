package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    void deleteById(Integer id);
    List<Book> findAll();
}
