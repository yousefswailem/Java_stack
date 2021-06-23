package com.axsos.me.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.me.models.lookify.Book;
import com.axsos.me.repositories.BookRepository;

@Service
public class BookService {
	 private final BookRepository bookRepository;
	    
	    public BookService(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    public List<Book> allBooks() {
	        return bookRepository.findAll();
	    }
	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	    
	    
}
