package com.axsos.yousef.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.yousef.models.Book;
import com.axsos.yousef.repositories.BookRepository;

@Service
public class BookService {
		private final BookRepository bookRepository;
	    
	    public BookService(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    // returns all the books
	    public List<Book> allBooks() {
	        return bookRepository.findAll();
	    }
	    // creates a book
	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
		public void deleteBook(Long id) {
			bookRepository.deleteById(id);
			}
		public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
			Book b = findBook(id);
			b.setTitle(title);
			b.setDescription(desc);
			b.setLanguage(lang);
			b.setNumberOfPages(numOfPages);
			return bookRepository.save(b);
			}
	}

