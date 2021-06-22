package com.yousef.code.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yousef.code.models.Books;

@Repository
public interface BookRepository extends CrudRepository<Books,Long>{

}
