package com.bookmanagement.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmanagement.demo.dao.BooksRepository;
import com.bookmanagement.demo.model.Books;

@Service
public class BooksService {	
	@Autowired
	private BooksRepository booksRepository;
	
	public List<Books> getAllBooks() {
		return booksRepository.findAll();
	}
	
	public Books addBook(Books book) {
		return booksRepository.save(book);
	}
	
	public Books getBookById(int id) {
		return booksRepository.findById(id).orElse(null);
	}
	
	public Books updateBook(int id, Books updatedBook) {
		if (booksRepository.existsById(id)) {
			updatedBook.setId(id);
			return booksRepository.save(updatedBook);
		} else {
			return null;
		}
	}
	
	public void deleteBooks(int id) {
		booksRepository.deleteById(id);
	}

}
