package com.bookmanagement.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bookmanagement.demo.service.BooksService;
import com.bookmanagement.demo.model.Books;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/books")
public class BooksController {
	@Autowired
	private BooksService booksService;
	
	@GetMapping
	public List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}
	
	@PostMapping
	public Books addBook(@RequestBody Books book) {
		return booksService.addBook(book);
	}
	
	@GetMapping("/{id}")
	public Books getBookById(@PathVariable int id) {
		return booksService.getBookById(id);
	}
	
	@PutMapping("/{id}") 
	public Books updateBook(@PathVariable int id, @RequestBody Books updatedBook) {
		return booksService.updateBook(id, updatedBook);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBooks(@PathVariable int id) {
		booksService.deleteBooks(id);
	}

}
