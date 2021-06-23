package com.axsos.me.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.me.models.lookify.Book;
import com.axsos.me.services.BookService;


@RestController
public class BooksApi {
 private final BookService bookService;
 public BooksApi(BookService bookService){
     this.bookService = bookService;
 }

 @RequestMapping(value="/api/books/create", method=RequestMethod.POST)
 public Book create(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") String rating) {
     Book book = new Book(title,artist,rating);
    	 
     return bookService.createBook(book);
 }
 
 
 
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.POST)
 public Book update(@PathVariable("id") String id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	 Long l= Long.parseLong(id);
	 Book book = bookService.updateBook(l, title, desc, lang, numOfPages);
     return book;
 }
 
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id);
 }
}
