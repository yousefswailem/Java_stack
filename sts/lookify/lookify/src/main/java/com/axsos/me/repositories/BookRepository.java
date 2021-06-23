package com.axsos.me.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.me.models.lookify.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
	Long deleteByTitleStartingWith(String search);
	List<Book> findByDescriptionContaining(String search);
}
