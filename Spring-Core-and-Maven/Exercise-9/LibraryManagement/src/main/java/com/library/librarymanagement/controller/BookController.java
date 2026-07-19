package com.library.librarymanagement.controller;
import com.library.librarymanagement.entity.Book;
import com.library.librarymanagement.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repository;
    public BookController(BookRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id);
        return repository.save(book);
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
        return "Book deleted successfully";
    }
}