package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books/index";
    }

    @GetMapping("create")
    public String renderCreateBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "books/create";
    }

    @PostMapping("create")
    public String createBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("delete")
    public String renderDeleteBookForm(Model model) {
        List<Book> books = bookService.findAll();
        System.out.println("Books to delete: " + books.size());
        model.addAttribute("books", books);
        return "books/delete";
    }

    @PostMapping("delete")
    public String deleteBook(@RequestParam(required = false) Integer[] bookIds) {
        if (bookIds != null) {
            for (Integer id : bookIds) {
                bookService.deleteById(id);
            }
        }

        return "redirect:/books";
    }

}
