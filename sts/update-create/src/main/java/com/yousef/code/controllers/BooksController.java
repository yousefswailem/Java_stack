package com.yousef.code.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yousef.code.models.Books;
import com.yousef.code.services.BookService;

@RestController
public class BooksController {
	final private BookService bookService;
	
	BooksController(BookService bookService){
		this.bookService = bookService;
	}
	@RequestMapping(value="/")
	List<Books> getBooks(){
		return bookService.getAllBooks();
		
	}
	@RequestMapping(value="")
	public Books createBooks(@RequestParam(value="title")String title,@RequestParam(value="description")String desc,@RequestParam(value="language")String lang,@RequestParam(value="numberofpages")String num) {
			
			return bookService.createBooks(title,desc,lang,num);
}
}
