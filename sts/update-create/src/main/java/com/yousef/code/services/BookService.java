package com.yousef.code.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yousef.code.models.Books;
import com.yousef.code.repositories.BookRepository;

@Service
public class BookService {
	
	final private BookRepository BookRepo;
	
	BookService(BookRepository BookRepo){
		this.BookRepo = BookRepo;
	}
	public List<Books> getAllBooks(){
		return (List<Books>) BookRepo.findAll();
	}
	
	Books createBook(Books b ,String title, String description,String language, String numberofpages) {
		
		b.setTitle(title);
		b.setDescription(description);
		b.setLanguage(language);
		b.setNumberofpages(numberofpages);
		return BookRepo.save(b);
	}
}
